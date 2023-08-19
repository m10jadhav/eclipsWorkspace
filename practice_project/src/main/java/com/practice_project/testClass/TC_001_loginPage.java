package com.practice_project.testClass;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.practice_project.pageObjectClass.BaseClass;
import com.practice_project.pageObjectClass.Login_page;

public class TC_001_loginPage extends BaseClass 
{
	@Test
	public void loginTest() throws InterruptedException, IOException {
		
		driver.get(baseURL);
		test=reports.createTest("Verify login test");

		Login_page login=new Login_page(driver);
		login.bankDomain();
		Thread.sleep(3000);
		login.setUserId(username);
		test.log(Status.PASS,"Username successfully Entered");
		Thread.sleep(3000);
        login.setpassword(password);
        test.log(Status.PASS,"Password successfully Entered");
		Thread.sleep(3000);
        login.clickSubmit();
        test.log(Status.PASS,"Click on Login Button");
		Thread.sleep(3000);
		String PageTitle="GTPL Bank Manager";
		String Title= driver.getTitle();
		System.out.println(Title);
		if(Title.equals(PageTitle)) {
			test.log(Status.PASS,"User successfully logged into an application");
			System.out.print("test pass");
			}
		else {
			test.log(Status.FAIL, "User cannot logged into Application");
			System.out.print("test fail");
			test.log(Status.FAIL, "Login test faild");
			   String Screenpath = BaseClass.Screenshot();
				test.addScreenCaptureFromPath(Screenpath);
		}
		
			
	  }
	}

		
	
	

	
//		login.setUserId("mngr435438");
//      login.setpassword("rateret");
//