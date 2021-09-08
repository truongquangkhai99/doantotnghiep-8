/**
 * @package com.tutv.annotation
 * @date Sep 7, 2021
 * @author trinh
 */
package com.tutv.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * DisplayName
 */
@Documented
@Retention(RUNTIME)
@Target({ FIELD, METHOD, PARAMETER, CONSTRUCTOR, ANNOTATION_TYPE })
public @interface DisplayName {

	/**
	 * name
	 *
	 * @return
	 */
	String name();

	/**
	 * suffix
	 *
	 * @return
	 */
	String suffix() default "";

}

