package com.onerivet.localexception;

import java.time.LocalDate; 
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.onerivet.dtostudent.Api_Response;

@RestControllerAdvice
public class GlobalExceptionHandler extends RuntimeException {
	
	@ExceptionHandler(Resourcenotfound.class)
	public Api_Response resourceNotFoundHandler(Resourcenotfound ex) {
		String message = ex.getMessage();
		LocalDateTime now = LocalDateTime.now();
		Api_Response api_Response = new Api_Response(message, now);
		return api_Response;
	}
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public  Map<String, String> handleInvalidArgument(MethodArgumentNotValidException m)
	{
		Map<String,String> errorMessage=new HashMap<String,String>();
		m.getBindingResult().getAllErrors().forEach((error)-> {
			
			
			String fieldName=((FieldError) error).getField();
			String message =error.getDefaultMessage();
			errorMessage.put(fieldName, message);
		});
		
		return errorMessage;
		
	}
	
}
