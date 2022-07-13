package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;

public class Congigdataprovider {
	
	
	Properties pro;

	public Congigdataprovider() throws Exception {
		String path="C:\\Users\\PRIYAL\\eclipse-workspace\\maven1\\config\\config.properties";
		
		
		
	FileInputStream fis = new FileInputStream(path)	;
	 pro=new Properties ();
		
	pro.load(fis);
		
	}
	
	
    public String getBaseUrl_QA1(){
   return pro.getProperty("BaseUrl_QA1");	
    	
    }
}
