//upload file

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_4class {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\MONIKA\\\\eclipse-workspace\\\\chromedriver\\\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.get("https://demo.guru99.com/test/upload/");
	    WebElement upload=driver.findElement(By.xpath("//input[@type='file']"));
	    upload.sendKeys("C:\\Users\\MONIKA\\Pictures\\java screenshot\\java.png");
	    WebElement checkBox= driver.findElement(By.xpath("//input[@type='checkbox']"));
	    checkBox.click();
	   WebElement submit= driver.findElement(By.xpath("//button[@type='button']"));
	   submit.click();
	  String title= driver.getTitle();
	  System.out.println(title);
	  
	  }

}
