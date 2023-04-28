package com.authentication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Security {
	
	@Bean
	public SecurityFilterChain filterchain(HttpSecurity http) throws Exception
	{
		http
		.csrf().disable()
		.authorizeHttpRequests()
		.requestMatchers("/Users/**").permitAll()
		.requestMatchers("/authority/**").permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.httpBasic();
		
		return http.build();
	}
	
	
//	public UserDetailsBuilder userDetailsBuilder()
//	{
//		
//		
//		return null;
//		
//	}
	
//	@Bean
//	public AuthenticationManagerBuilder authenticationManagerBuilder(AuthenticationManagerBuilder auth) throws Exception
//	{
//	
//		
//		auth.inMemoryAuthentication().withUser("sonali").password("sonali09").roles("ADMIN");
//		auth.inMemoryAuthentication().withUser("tyy").password("dfrt").roles("NORMAL");
//		return auth;
//		
//	}
//	
//	@Bean
//   public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfiguration) throws Exception
//   {   
//	return authConfiguration.getAuthenticationManager();
//	   
//   }
	
	
	

}
