package com.onerivet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.onerivet.models.EmailSenderService;

@SpringBootApplication
public class UnitTestingApplication {

	@Autowired
	private EmailSenderService emailSenderService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(UnitTestingApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() {
		
		emailSenderService.sendSimpleEmail("sonaligupta0910200@gmail.com", "Hello", "heeello");

	}

}
