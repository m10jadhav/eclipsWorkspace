package com.M_project.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	public static Properties pro;
	public static FileInputStream file;
	
	public void Readconfig() throws IOException {
	
		File src=new File("C:\\Users\\MONIKA\\eclipse-workspace\\M_project\\Configuration\\Config.properties"); 	
	    pro=new Properties();
	
   try {
		 file=new FileInputStream(src);
        pro=new Properties();
		pro.load(file);
      } catch (FileNotFoundException e) {
	
	 System.out.println("Exception msg is"+e.getMessage());
	}
	}
	public String getApplicationURL() {
		//String url=pro.getProperty("baseURL");
		//return url;
		String url =pro.getProperty("baseURL");
		return url;
	}
	public String getUserName() {
        String username=pro.getProperty("username");
	    return username;
	}
	public String getPassword() {
		String password=pro.getProperty("password");
		return password;
	}

	
}
