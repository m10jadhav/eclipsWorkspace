//browser launch facebook and google

package java_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_class
{  
	public static void main(String[]args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MONIKA\\eclipse-workspace\\chromedriver\\chromedriver.exe" );
	
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/"); 
	
	  Thread.sleep(2000);
	   driver.navigate().to("https://www.google.com/");
	
	}
	
	

}

