package com.authentication;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SecurityTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityTaskApplication.class, args);
	}

	@Bean
	public ModelMapper modelmapper()
	{
		return new ModelMapper();
	}
}
