//waits in selenium

package wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S_wait {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MONIKA\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.get("https://demo.guru99.com/test/ajax.html");
	    WebElement yes=driver.findElement(By.xpath("//input[@id='yes']"));
	    yes.click();
	    Thread.sleep(2000);   //java wait
	    
	    WebElement no=driver.findElement(By.xpath("//input[@id='no']"));
	    no.click();
	    driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);    //implicit wait
	    
	    WebElement check=driver.findElement(By.xpath("//input[@id='buttoncheck']"));
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); //Explicit wait 
	    wait.until(ExpectedConditions.visibilityOf(check));
	    check.click();
    }

}