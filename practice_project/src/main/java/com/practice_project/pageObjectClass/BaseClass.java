package com.practice_project.pageObjectClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.practice_project.utilityClass.readconfig;


public class BaseClass {
	
	public static WebDriver driver;
	public static ExtentSparkReporter sparkreport;
	public static ExtentReports reports;
	public static ExtentTest test;
	
	readconfig read = new readconfig();
	public String baseURL = read.getApplicationURL();
	public String username = read.getUserId();
	public String password = read.getPassword();
	
    //public String userId="mngr435438";
	//public String pass="rateret";
	public String url="https://demo.guru99.com/V1/index.php"; 
	
	@Parameters("Browser")
	@BeforeClass
	public void setUP(String s)
	{  
		if(s.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONIKA\\eclipse-workspace\\practice_project\\BrowserDriver\\chromedriver.exe");
	    driver=new ChromeDriver();
		System.out.println("chrome driver Browser started");
		// driver.get(baseURL);
	    }else if(s.equals("mozilla")) {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\MONIKA\\eclipse-workspace\\practice_project\\BrowserDriver\\geckodriver.exe");
		 driver=new FirefoxDriver();
         System.out.println("Mozilla Browser started");
	    }else if(s.equals("IE")) {
	    	System.setProperty("webdriver.ie.driver", "C:\\Users\\MONIKA\\eclipse-workspace\\practice_project\\BrowserDriver\\IEDriverServer.exe");
	        driver=new InternetExplorerDriver();
	        System.out.println("InternetExplorer Browser starter");
	   } else if(s.equals("edge")) {
	    	System.setProperty("webdriver.edge.driver", "C:\\Users\\MONIKA\\eclipse-workspace\\practice_project\\BrowserDriver\\msedgedriver.exe");
	        driver=new EdgeDriver();
	    }
		driver.get(baseURL);
	  }
	@BeforeSuite    
	public void Report() {
		sparkreport= new ExtentSparkReporter("C:\\Users\\MONIKA\\eclipse-workspace\\practice_project\\Reports\\R"+".html");
		sparkreport.config().setDocumentTitle("Integration Test Report");
		sparkreport.config().setDocumentTitle("QA Automation Test Report");
		sparkreport.config().setTheme(Theme.DARK);
		
		reports=new ExtentReports();
		reports.attachReporter(sparkreport);
		reports.setSystemInfo("Operating System", "Windows");
		reports.setSystemInfo("Environment", "QA");
		
	}
	public static  String Screenshot() throws IOException {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dest= "C:\\Users\\MONIKA\\eclipse-workspace\\practice_project\\Screenshots\\S"+".png";
		File destFile=new File(dest);
		FileUtils.copyFile(source, destFile);
		
		return dest;
	}
	
	
   //@AfterClass
   //public void closebrowser() {
   //   driver.quit();
   //}
	@AfterSuite
	public void closeSuit() {
		reports.flush();
		
	}
	
}
