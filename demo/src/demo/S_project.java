package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_project {
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MONIKA\\Downloads\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    WebElement email= driver.findElement(By.xpath("//input[@type='text']"));
	    email.sendKeys("abcd");
	    WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
	    password.sendKeys("abcd");
	  //  WebElement button= driver.findElement(By.xpath("//button[@name='login']"));
	  //  button.click();
	   // WebElement Forgot_password = driver.findElement(By.linkText("Forgotten password?"));
	   // Forgot_password.click();
        WebElement new_account= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        new_account.click();
	}}
