package com.testframework.converters;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.aeonbits.owner.Converter;

import com.testframework.enums.BrowserType;

public class StringTOBrowserTypeConverter implements Converter<BrowserType> {

	public BrowserType convert(Method method, String browserName) {
		
		@SuppressWarnings("serial")
		Map<String,BrowserType> stringBrowserTypeMap = new HashMap<String, BrowserType>(){{
			put("CHROME",BrowserType.CHROME);
				put("FIREFOX",BrowserType.FIREFOX);
				
		}};
		return stringBrowserTypeMap.getOrDefault(browserName.toUpperCase(),BrowserType.CHROME); 
			
		
	}

}