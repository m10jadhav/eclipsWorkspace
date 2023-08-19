package test_opnBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONIKA\\Downloads\\chromedriver_win32\\chromedriver109.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	} 

}
