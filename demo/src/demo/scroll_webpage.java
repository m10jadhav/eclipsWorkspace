package demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_webpage {
	
	public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MONIKA\\Downloads\\chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor jr=((JavascriptExecutor)driver);
		jr.executeScript("window.scrollBy(0,850)");
		jr.executeScript("window.scrollBy(0,-850)");
	}
	
	
	
	

}
