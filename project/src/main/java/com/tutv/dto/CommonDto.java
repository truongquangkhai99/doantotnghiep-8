/**
 * @package dto
 * @date Dec 10, 2021
 * @author trinh
 */
package com.tutv.dto;


import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.context.MessageSource;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.tutv.annotation.DisplayName;


/**
 * CommonDto
 */
public class CommonDto implements Serializable {

	/**
	 * Field serialVersionUID
	 */
	private static final long serialVersionUID = -2791577721739079667L;

	/**
	 * validate
	 *
	 * @param clazz
	 * @param result
	 * @param messageSource
	 * @param locale
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws InstantiationException
	 */
	public void validate(Class<?> clazz, BindingResult result, MessageSource messageSource, Locale locale)
	    throws IllegalAccessException,
	    InvocationTargetException, InstantiationException {
		Field[] fields = this.getClass().getDeclaredFields();
		for (Field field : fields) {
			Annotation[] annotations = field.getDeclaredAnnotations();
			for (Annotation annotation : annotations) {
				Object a = field.getDeclaredAnnotation(annotation.annotationType());
				Class<? extends Annotation> ann = annotation.annotationType();
				try {
					Method mthd = ann.getDeclaredMethod("groups");
					Class<?>[] groups = (Class<?>[]) mthd.invoke(a);
					List<Class<?>> cls = new ArrayList<Class<?>>(Arrays.asList(groups));
					if (cls.indexOf(clazz) > -1) {
						Constraint constraint = ann.getDeclaredAnnotation(Constraint.class);
						Class<? extends ConstraintValidator<?, ?>> cont = constraint.validatedBy()[0];
						Object contIns = cont.newInstance();
						Method initMtd = cont.getDeclaredMethod("initialize", ann);
						initMtd.invoke(contIns, a);
						Method validMtd = cont.getDeclaredMethod("isValid", Object.class, ConstraintValidatorContext.class);
						String fname = field.getName();
						Method propMtd = this.getClass()
						    .getDeclaredMethod("get" + fname.substring(0, 1).toUpperCase() + fname.substring(1));
						Object vl = propMtd.invoke(this);
						boolean res = (boolean) validMtd.invoke(contIns, vl, null);
						if (res == false) {
							DisplayName d = field.getAnnotation(DisplayName.class);
							String fieldName = fname;
							if (d != null) {
								fieldName = messageSource.getMessage(d.name(), null, locale) + d.suffix();
							}
							Method messageMthd = ann.getDeclaredMethod("message");
							String messageCode = (String) messageMthd.invoke(a);

							String[] repl;
							try {
								Method valueMthd = ann.getDeclaredMethod("value");
								Object value = valueMthd.invoke(a);
								repl = new String[] { fieldName, String.valueOf(value) };
							} catch (NoSuchMethodException ex1) {
								try {
									Method regexMthd = ann.getDeclaredMethod("regex");
									String regex = (String) regexMthd.invoke(a);
									repl = new String[] { fieldName, regex };
								} catch (NoSuchMethodException ex2) {
									try {
										Method minLengthMthd = ann.getDeclaredMethod("minLength");
										Method maxLengthMthd = ann.getDeclaredMethod("maxLength");
										Object min = minLengthMthd.invoke(a);
										Object max = maxLengthMthd.invoke(a);
										repl = new String[] { fieldName, String.valueOf(min), String.valueOf(max) };
									} catch (NoSuchMethodException ex3) {
										repl = new String[] { fieldName };
									}
								}
							}
							String message = messageSource.getMessage(messageCode, repl, locale);
							String clsName = ann.getName();
							String[] clsSp = clsName.split("\\.");
							String clsNm = "";
							if (clsSp.length > 0) {
								clsNm = clsSp[clsSp.length - 1];
							} else {
								clsNm = clsName;
							}
							String[] codes = new String[] { clsName, clsNm + "." + fname };
							ObjectError error = new ObjectError(fname, codes, null, message);
							result.addError(error);
						}
					}
				} catch (NoSuchMethodException ex) {
				}
			}
		}
	}
}
