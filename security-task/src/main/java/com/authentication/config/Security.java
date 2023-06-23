package com.authentication.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.authentication.filter.JwtFilter;
import com.authentication.password.Password;
import com.authentication.service.UsersDetailService;



@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class Security {
	
	@Autowired
	private Password password; 
	
	@Autowired
	private JwtFilter jwtFilter;
	
	@Bean
	public SecurityFilterChain filterchain(HttpSecurity http) throws Exception
	{
		return 
		http.cors().and()
		.csrf().disable()
		.authorizeHttpRequests()
		.requestMatchers("/users/add-users", "/users/message", "/users/authentication").permitAll()
		.anyRequest()
		.authenticated()
		.and()
		//.httpBasic().and().build();
		.sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and()
		.authenticationProvider(authenticationProvider())
		.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class).build();
		
		
		
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
	
	@Bean
    public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authenticationProvider=new DaoAuthenticationProvider();
		authenticationProvider.setUserDetailsService(UsersDetailService());
		authenticationProvider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return authenticationProvider;
  }
	
     @Bean
	 UserDetailsService UsersDetailService() {
    	 
	      return new UsersDetailService();
}


	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfiguration) throws Exception {
		return authConfiguration.getAuthenticationManager(); 
	}
	
	

}
