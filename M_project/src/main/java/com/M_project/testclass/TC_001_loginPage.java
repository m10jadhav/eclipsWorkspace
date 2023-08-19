package com.M_project.testclass;

import org.testng.annotations.Test;
import com.M_project.pageobjectclass.BaseClass;
import com.M_project.pageobjectclass.LoginPage;
import com.M_project.utilities.ReadConfig;
import com.aventstack.extentreports.Status;


public class TC_001_loginPage extends BaseClass
{
	@Test
	public void loginTest() throws Exception {
	try{	
		driver.get("baseURL");
        test=report.createTest("Verify appliction login");
		
        LoginPage login = new LoginPage(driver);
		login.setUserName("username");
		test.log(Status.PASS, "username successfully entered");
		   Thread.sleep(4000);
		login.setPassword("password");
		test.log(Status.PASS, "password successfully entered");
	       Thread.sleep(2000);
		login.clickLogin();
		test.log(Status.PASS, "clicked login button");
		   Thread.sleep(2000);
       // login.clickReset();
		if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			test.log(Status.PASS,"user successfully loged into the application");
			System.out.println("Title is correct");
		}else {
			test.log(Status.FAIL, "login failed");
			System.out.println("Title is incorrect");
		}
	}
	catch(Exception e) {
		test.log(Status.FAIL, "login falied");
		String ScreenPath=BaseClass.captureScreen();
		test.addScreenCaptureFromPath(ScreenPath);
	}
		
	}

}
