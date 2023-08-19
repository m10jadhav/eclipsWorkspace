//page scroll down/up

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S7 {
 
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONIKA\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://courses.letskodeit.com/practice");
	    driver.manage().deleteAllCookies();
	    WebElement select =driver.findElement(By.xpath("//input[@id='disabled-button']"));
	    JavascriptExecutor jr = ((JavascriptExecutor) driver);
	    jr.executeScript("arguments[0].scrollIntoView();",select); 
	    
	    jr.executeScript("window.scrollBy(0,20)"); // scroll down
	    
	    
	    jr.executeScript("window.scrollBy(0,-20)"); // scroll up
	   Thread.sleep(2000);
	    Point P= new Point(100,300);              //set position
	    driver.manage().window().setPosition(P);
	    Thread.sleep(3000);
	    Dimension d= new Dimension(50,80);       // set dimension
	     driver.manage().window().setSize(d);
	    
	}
	
}
