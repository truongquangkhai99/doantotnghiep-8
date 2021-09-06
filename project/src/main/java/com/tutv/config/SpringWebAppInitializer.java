package com.tutv.config;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.filter.CharacterEncodingFilter;

public class SpringWebAppInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		 // UTF8 Character Filter.
	      FilterRegistration.Dynamic fr = servletContext.addFilter("encodingFilter", CharacterEncodingFilter.class);

	      fr.setInitParameter("encoding", "UTF-8");
	      fr.setInitParameter("forceEncoding", "true");
	      fr.addMappingForUrlPatterns(null, true, "/*");  
	}

}
