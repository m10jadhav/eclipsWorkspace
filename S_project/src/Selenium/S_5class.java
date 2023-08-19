package Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_5class {
     public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\MONIKA\\eclipse-workspace\\chromedriver\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().deleteAllCookies();
       driver.get("https://opensource-demo.orangehrmlive.com/");
       WebElement linkedIn=driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']"));
       linkedIn.click();
       Thread.sleep(2000);
       WebElement Facebook=driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']"));
       Facebook.click();
      Thread.sleep(2000);
       WebElement twitter=driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']"));
       twitter.click();
       Thread.sleep(2000);
       WebElement youtube=driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']"));
       youtube.click(); 
       Thread.sleep(2000);
       
      Set<String> allwindows= driver.getWindowHandles();
      System.out.println(allwindows);
      List<String>list=new ArrayList<String>(allwindows);
      String twitterTitle="OrangeHRM (@orangehrm) / Twitter";
     
      for(String s: list)
      {
    	 String windowtitle =driver.switchTo().window(s).getTitle();
    	  System.out.println(windowtitle);
    	 
    	 if(windowtitle.equals(twitterTitle))
    	  {
    		  System.out.println("correct window");
    		driver.switchTo().window(twitterTitle);
    	  }
    	System.out.println("incorrect window");
      }
    }
}
