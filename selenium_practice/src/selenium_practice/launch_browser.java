package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_browser {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONIKA\\Downloads\\chromedriver_win32\\chromedriver109.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.get("https://facebook.com/");
	    WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
	    username.sendKeys("abcd");
	    WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
	    password.sendKeys("1234");
	  // WebElement login= driver.findElement(By.xpath("//button[@value='1']"));
	  // login.click();
	    WebElement new_acc=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	    new_acc.click();
	
	
	
	}

}
