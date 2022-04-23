package com.testframework.test;

import org.aeonbits.owner.ConfigCache;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.testframework.config.FactoryConfig;
import com.testframework.config.FrameworkConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	public WebDriver driver;
	
	//Local, Remote
	
	@Test
	public void login() {
				
		FrameworkConfig config = ConfigCache.getOrCreate(FrameworkConfig.class);
		
		System.out.println(FactoryConfig.getConfig().browser());
		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		driver.get("https:www.google.com");
//		driver.quit();
	}
	
	
}
