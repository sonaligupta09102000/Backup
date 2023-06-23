package com.onerivet.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
	
	@Autowired
	private JavaMailSender javaMailSender; 
	
	public void sendSimpleEmail(String toEmail, String body, String subject)
	{
		SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
		simpleMailMessage.setFrom(toEmail);
		simpleMailMessage.setTo(toEmail);
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(body);
		
		javaMailSender.send(simpleMailMessage);
		
		System.out.println("Mail Send........");
		
	}
	

}
