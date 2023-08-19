package com.bankingproject.PageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver Ldriver;
	
	@FindBy(xpath="//input[@name='uid']")
	   WebElement UserId;
	@FindBy(xpath="//input[@name='password']")
	   WebElement Password;
	@FindBy(xpath="//input[@name='btnLogin']")
	   WebElement Login;
	@FindBy(xpath="//input[@name='btnReset']")
	   WebElement Reset;
	
	 public LoginPage(WebDriver rdriver){
		Ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	public void setUserName(String name){
		UserId.sendKeys(name);
	}  
	public void setPassward(String pass){
		Password.sendKeys(pass);	
	}
	public void clickLoginButton() {
		Login.click();
	}
	public void clickResetButton() {
		Reset.click();
	}
}
