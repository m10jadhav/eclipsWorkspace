//waits in selenium

package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class s_wait
{
    public static void main(String[]args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONIKA\\eclipse-workspace\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://demo.guru99.com/test/ajax.html");
        
       WebElement yesButton= driver.findElement(By.xpath("//input[@value='Yes']"));
       yesButton.click();
       Thread.sleep(2000);         //java wait
       
       WebElement noButton= driver.findElement(By.xpath("//input[@value='No']"));  
       noButton.click();
       driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); //selenium wait
       
       WebElement checkBox= driver.findElement(By.xpath("//input[@value='Check']"));
       checkBox.click();
      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); // org.openqa.selenium.support.ui.WebDriverWait.WebDriverWait(WebDriver driver, Duration timeout)
                                                             // WebDriverWait(WebDriver driver, Duration timeout)

      // wait.until(ExpectedConditions.visibilityOf(checkBox));//ExpectedCondition<WebElement> org.openqa.selenium.support.ui
                                                             //ExpectedConditions.visibilityOf(WebElement element)
        
      // WebDriverWait wait=new WebDriverWait(driver, 2);// org.openqa.selenium.support.ui.WebDriverWait.WebDriverWait(WebDriver driver, Duration timeout)

    }
}
