package com.bankingproject.utilityclass;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigFile {
	
	Properties pro;
	public ReadConfigFile() {
		File src= new File("C:\\Users\\MONIKA\\eclipse-workspace\\Practice_framework\\Configuration");
		FileInputStream file;
		try {
			pro =new Properties();
			file= new FileInputStream(src);
			pro.load(file);
		}catch(Exception e) {
			System.out.println("Exception msg is "+e.getMessage());
		}
	}
	
	public String getApplicationURL() {
		String url=pro.getProperty("baseUrL");
		return url;
		}
	public String getUserName() {
		String username=pro.getProperty("username");
		return username;
	}
	
	public String getpassword() {
		String password=pro.getProperty("password");
        return password;
	}
	
	
}
