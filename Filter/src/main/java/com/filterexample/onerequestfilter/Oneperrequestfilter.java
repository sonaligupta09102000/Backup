package com.filterexample.onerequestfilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(1)
public class Oneperrequestfilter implements Filter {
	
 

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
	 
		String parameter = request.getParameter("name");
		
	
		
		request.setAttribute("Name",parameter.toUpperCase());
		
	    chain.doFilter(request, response);
		
	}

}
