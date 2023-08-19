
//use of Actions class to perform Double click/ Right click/ click


package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S8 {
   public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\MONIKA\\eclipse-workspace\\chromedriver\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://demoqa.com/buttons");
    driver.manage().deleteAllCookies();
    WebElement doubleClick= driver.findElement(By.xpath("//button[text()='Double Click Me']")); //by text()
    WebElement rightClick= driver.findElement(By.xpath("//button[@id='rightClickBtn']"));      //by relative xpath
    WebElement click= driver.findElement(By.xpath("(//button[@type='button'])[4]"));          //by index value
     
   Actions act= new Actions(driver);                         //object of Actions class 
   act.moveToElement(doubleClick).doubleClick().build().perform();
   Thread.sleep(2000);
   act.moveToElement(rightClick).contextClick().build().perform();
   Thread.sleep(2000);
   act.moveToElement(click).click().build().perform();
   
   }
}
