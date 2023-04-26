package com.deskbook.SecurityDeskbook.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig{

	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception 
	{
		http
		.cors()
		.and()
		.authorizeHttpRequests(	
		  (authorize)->authorize.requestMatchers("/","deskbook/api")
		  .permitAll()
		  .anyRequest()
		  .authenticated()
		  )
		.oauth2ResourceServer().jwt();
		 
	
		return http.build();
		
		
	}

}
