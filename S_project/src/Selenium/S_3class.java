//how to handle popups in selenium (switch to alert)

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_3class {
   public static void main(String []args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\MONIKA\\eclipse-workspace\\chromedriver\\chromedriver.exe");
       WebDriver driver =new ChromeDriver();
       driver.manage().deleteAllCookies();
       driver.get("https://courses.letskodeit.com/practice");
      WebElement enterName= driver.findElement(By.xpath("//input[@id='name']"));
      enterName.sendKeys("monika");
      
      Thread.sleep(4000);
      WebElement alert = driver.findElement(By.xpath("//input[@id='alertbtn']"));
      alert.click();
      driver.switchTo().alert().accept();
      Thread.sleep(4000);
      Thread.sleep(4000);
      WebElement  confirm  =driver.findElement(By.xpath("//input[@id='confirmbtn']"));
      confirm.click();
      Thread.sleep(4000);
      driver.switchTo().alert().accept();
      Thread.sleep(4000);
      confirm.click();
      Thread.sleep(4000);
      driver.switchTo().alert().dismiss();
      Thread.sleep(4000);
      confirm.click();
      Thread.sleep(4000);
      String text= driver.switchTo().alert().getText();
      System.out.println(text);
     
   } 
}
