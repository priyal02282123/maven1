package com.pagrobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpom {

	@FindBy(how=How.XPATH,using="//  input[@id='email']")
	
	private WebElement txt_email;
	
    @FindBy(how=How.XPATH,using="//  input[@id='pass']")
	
	private WebElement txt_password;
    
    public WebElement gettxt_email() {
    	
    	return txt_email;
    }
    public WebElement gettxt_pass() {
    	
    	return txt_password;
    }
    
    
}
