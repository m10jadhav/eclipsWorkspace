package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONIKA\\Downloads\\chromedriver_win32\\chromedriver109.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.com");
		WebElement option=driver.findElement(By.xpath("//select[@name='url']"));
		Select S=new Select(option);
	    S.selectByIndex(4);
	    S.selectByValue("Apps & Games");
		
	}

}
