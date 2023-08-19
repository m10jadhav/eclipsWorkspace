//find elements by XPATH .......>>Absolute path

package java_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S3_class {

  public static void main(String[]agrs) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\MONIKA\\eclipse-workspace\\chromedriver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().deleteAllCookies();
      driver.get("https://www.amazon.com/");
      
	  WebElement search=driver.findElement(By.xpath("/html/body/div/header/div/div/div[2]/div/form/div/div/div/select"));
       WebElement nation =driver.findElement(By.xpath("//a[@id='nav-global-location-popover-link']")); 
     
       WebElement cart= driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[4]/div[1]/span[1]"));
	  
     search.click();
     Thread.sleep(4000);
      search.click();
     Thread.sleep(4000);
     nation.click();
     Thread.sleep(4000);
     cart.click();
  }




}
