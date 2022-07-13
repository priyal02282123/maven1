package com.utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass<excel> {    
	
	
	public static WebDriver driver;
	public static Congigdataprovider config;
	public static Excelldataprovider excel;
	
	

	
	@BeforeSuite
	public void StartSetup() throws Exception {
		 config=new Congigdataprovider();
		 excel=new Excelldataprovider ();
		 
	}
	@Parameters({"BrowserName"})
  @BeforeMethod
  
  public void setup(String BrowserName) {
		if (BrowserName.equalsIgnoreCase("chrome")) {
	  WebDriverManager.chromedriver().setup();
		  WebDriver driver =new ChromeDriver();
		  
	} 

	
	else if(BrowserName.equalsIgnoreCase("Edge")) {
		WebDriverManager.edgedriver().setup();
		 WebDriver driver=new EdgeDriver();
}
	
		  driver.get(config.getBaseUrl_QA1());
		  driver.manage().window().maximize();
		 
  
	}
  
  @AfterMethod
  
  public void teardown() {
	  
	  driver.quit();
	  
	  
  }
  
  
}
