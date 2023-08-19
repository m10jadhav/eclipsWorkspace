

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S5_class {
  
	public  static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONIKA\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().deleteAllCookies();
		
		WebElement fName=driver.findElement(By.xpath("//input[@id='firstName']"));
	    fName.sendKeys("Monika");
	    WebElement lName=driver.findElement(By.xpath("//input[@id='lastName']"));
	    lName.sendKeys("Jadhav");
	    WebElement mail=driver.findElement(By.xpath("//input[@id='userEmail']"));
	    mail.sendKeys("monika91jadhav@gmail.com");
	    WebElement select =driver.findElement(By.xpath("//input[@name='gender']"));
	   // select.click();
	    boolean displayOption=select.isDisplayed();
	    System.out.println("option dispalyed");
	  	WebElement select1=driver.findElement(By.xpath("//input[@id='gender-radio-1']"));   
	    select1.click();
	    	
	   
         boolean selectOption = select1.isSelected();
	   if(selectOption==true) {
	 System.out.println("selected option male");
	   }else 
	     {
		 System.out.println("option is not seleted");
		 }

	

	}}

	
	

