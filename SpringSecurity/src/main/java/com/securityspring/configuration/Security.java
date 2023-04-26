package com.securityspring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.securityspring.password.Password;

@Configuration
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter{

	@Autowired
	private Password password;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http
//		        .cors()
//		        .disable()
		        .csrf().disable()
               .authorizeHttpRequests()
               .antMatchers("/","index").permitAll()
               .antMatchers("/company/").hasAnyRole("STUDENT")
               .anyRequest()
               .authenticated()
               .and()
               .httpBasic();
               
	}

	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		 UserDetails builder = User.builder()
				 .username("sonali")
				 .password(password.passwordencoder().encode("sonali09"))
				 .roles("STUDENT")
				 .build();

		return new InMemoryUserDetailsManager(
				builder
				);
		
	}
		
}
