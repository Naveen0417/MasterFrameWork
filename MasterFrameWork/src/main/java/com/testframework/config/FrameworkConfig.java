package com.testframework.config;

import org.aeonbits.owner.Config;

import com.testframework.converters.StringTOBrowserTypeConverter;
import com.testframework.enums.BrowserType;

@Config.Sources({
	"system:properties",
	"system:env",
	"file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {

	@DefaultValue("CHROME")
	@ConverterClass(StringTOBrowserTypeConverter.class)
	BrowserType browser();
	
}
