//functions of webelement

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S6
{
   public static void main(String[]args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONIKA\\eclipse-workspace\\chromedriver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.ironspider.ca/forms/checkradio.htm");
    driver.manage().deleteAllCookies();
   
    WebElement green = driver.findElement(By.xpath("//input[@value='green']"));
    boolean colour= green.isDisplayed();
    if(colour==true) {
    	System.out.println("green colour displayed");
    	}else {
    	 System.out.println("green colour not displayed");
       }
       green.click();
        boolean colour1=green.isSelected();
        if(colour1==true){
    	System.out.println("green colour selected ");
        }else {
    	System.out.println("green colour not selected");
        }
        
        boolean colour2=green.isEnabled();
        if(colour2==true) {
    		System.out.println("button is enabled");
        }else {
    	System.out.println("button is not enabled");
    }
}
    
    
    
    
    
   
    

}