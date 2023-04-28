package com.filterexample.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.filterexample.filterrequest.UpperCaseFilter;

@Configuration
public class WebConfig {
	
	@Bean
	public FilterRegistrationBean<UpperCaseFilter> UpperCaseFilter()
	{
		FilterRegistrationBean<UpperCaseFilter> registrationFilter=new FilterRegistrationBean<>();
		registrationFilter.setFilter(new UpperCaseFilter());
		registrationFilter.addUrlPatterns("/user");
		return registrationFilter;
		
	}

}
