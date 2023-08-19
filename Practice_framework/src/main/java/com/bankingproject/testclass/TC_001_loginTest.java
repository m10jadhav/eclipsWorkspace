package com.bankingproject.testclass;

import org.testng.annotations.Test;


import com.bankingproject.PageObjectClass.BaseClass;
import com.bankingproject.PageObjectClass.LoginPage;

public class TC_001_loginTest extends BaseClass
{
	@Test
	public void loginTest() throws Exception  {
		

		LoginPage login = new LoginPage(driver);
	    
		login.setUserName(username);
		
		Thread.sleep(2000);

		login.setPassward(password);
		Thread.sleep(2000);

		login.clickLoginButton();
		Thread.sleep(2000);

		
		String Title="GPTL Bank Home Page";
		Thread.sleep(2000);

		
		if(driver.getTitle().equals(Title)) {
			System.out.println("correct page");
		}else
		{
			System.out.println("incorrect page");
		}
	}
}
