package com.filterexample.filterrequest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class UpperCaseQueryParamHttpServletRequestWrapper extends HttpServletRequestWrapper {
	
	private final Map<String,String[]> modifiedParameters;

	public UpperCaseQueryParamHttpServletRequestWrapper(HttpServletRequest request) {
		super(request);
		modifiedParameters=convertParameterToUpperCase(request.getParameterMap());
		
	}
	
	
	@Override
	public String getParameter(String name) {
		String[] values=modifiedParameters.get(name);
		return values!=null && values.length>0 ? values[0]:null;
	}




	@Override
	public Map<String, String[]> getParameterMap() {
		
		return Collections.unmodifiableMap(modifiedParameters);
	}

	
	@Override
	public String[] getParameterValues(String name) {
		
		return modifiedParameters.get(name);
	}


	private Map<String, String[]> convertParameterToUpperCase(Map<String, String[]> parameterMap) {
		
		Map<String,String[]> uppercaseparameter=new HashMap<>();
		 for(Map.Entry<String, String[]> entry:parameterMap.entrySet())
		 {
			String[] values=entry.getValue();
			String[] upperCaseValue= new String[values.length];
			
			for(int i=0;i<values.length;i++)
			{
				upperCaseValue[i]=values[i].toUpperCase();
			}
			
			uppercaseparameter.put(entry.getKey(), upperCaseValue);
		
		 }
		return uppercaseparameter;
	}

}
