package com.practice_project.utilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readconfig {
	FileInputStream file;
	Properties pro;

	public readconfig() {

		File config = new File(
				"C:\\Users\\MONIKA\\eclipse-workspace\\practice_project\\Configuration\\Config.property");
		try {
			file = new FileInputStream(config);
			pro = new Properties();
			pro.load(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getApplicationURL() {
		String URL = pro.getProperty("baseURL");
		return URL;
	}

	public String getUserId() {
		String UID = pro.getProperty("userID");
		return UID;
	}

	public String getPassword() {
		String pass = pro.getProperty("password");
		return pass;
	}
}
