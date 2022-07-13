package com.logintest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pagrobject.Loginpom;
import com.utility.Baseclass;
import com.utility.Library;

public class Test_001 extends Baseclass {
	@Test
	public void verifyLoginpage() {

		
		
		//identify webelement
		
		Loginpom login=PageFactory.initElements(driver, Loginpom.class);
			
		
		
		    Library.custom_sendkeys(login.gettxt_email(), excel.getStringData("Sheet1", 0,0));
		    Library.custom_sendkeys(login.gettxt_pass(), excel.getStringData("Sheet1", 0, 1));
		    
			
	}

	
	
	}

