package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONIKA\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    WebElement options =  driver.findElement(By.xpath("//select[@name='url']"));
	
	    Select opt = new Select(options);
	   // opt.selectByIndex(3);
	   // opt.selectByValue("Baby");
	    opt.selectByVisibleText("Books");
	
	}

}
