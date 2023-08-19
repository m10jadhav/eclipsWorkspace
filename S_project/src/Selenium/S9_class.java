//drag and drop by Actions class
package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S9_class {
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\MONIKA\\\\eclipse-workspace\\\\chromedriver\\\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://jqueryui.com/droppable/");
    driver.manage().deleteAllCookies();
    driver.switchTo().frame(0);
 
   WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
   WebElement drop= driver.findElement(By.xpath("//div[@id='droppable']"));
  
   Actions act= new Actions(driver);  //Object of Actions class
   act.dragAndDrop(drag,drop).perform();
   
   }
}
