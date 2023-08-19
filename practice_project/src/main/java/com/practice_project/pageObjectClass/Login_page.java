package com.practice_project.pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page 
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement userID;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
    @FindBy(xpath="//input[@type='submit']")
	WebElement submitButton;
    @FindBy(xpath="//input[@type='reset']")
	WebElement resetButton;
    @FindBy(xpath="//a[text()='Bank Project']")
	WebElement project_link ;

    
    
    
	public Login_page(WebDriver Ldriver){
		driver=Ldriver;
		PageFactory.initElements(Ldriver, this);
	}
    
	public void setUserId(String userId ){
		userID.sendKeys(userId);
	}
	
	public void setpassword(String pass){
		password.sendKeys(pass);
		
	}
	
	public void clickSubmit() {
		submitButton.click();
	}
	
	public void bankDomain() {
		project_link.click();
	}
	
}
