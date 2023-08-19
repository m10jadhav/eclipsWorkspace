package com.bankingproject.PageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.bankingproject.utilityclass.ReadConfigFile;


public class BaseClass {
	
	ReadConfigFile readconfig=new ReadConfigFile();
	public String baseURL =readconfig.getApplicationURL();
	public String username=readconfig.getUserName();
	public String password=readconfig.getpassword();
	
	public static WebDriver driver;
//	@Parameters("browser")
	@BeforeMethod
	public void setup() {
		
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONIKA\\Downloads\\chromedriver_win32 (1).exe");
		 //   driver=new ChromeDriver();
		   // driver.get("https://demo.guru99.com/V1/index.php");
//    if(str.equals("chrome")) {
    	
	//    System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONIKA\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//   driver=new ChromeDriver();
	//    driver.get("https://demo.guru99.com/V1/index.php");
	//	}else if(str.equals("firefox")){
			
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\MONIKA\\Downloads\\geckodriver-v0.31.0-win64");
	     driver=new FirefoxDriver();
		 driver.get("https://demo.guru99.com/V1/index.php");

		}
	
	@AfterMethod
	public void closeBrowser() {
	  
       driver.quit();
	}
}




