package com.M_project.pageobjectclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.M_project.utilities.ReadConfig;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class BaseClass {
	public static WebDriver driver;
	public static ExtentSparkReporter sparkReporter;
	public static ExtentReports report;
	public static ExtentTest test;
    public static File file;
	//ReadConfig readconfigFile=new ReadConfig();
    ReadConfig readconfigFile = new ReadConfig();
   // readconfigFile.getApplicationURL();
    
	
	public String baseURL=readconfigFile.getApplicationURL();
	public String username=readconfigFile.getUserName();
	public String password=readconfigFile.getPassword();
	
	@Parameters("browser")
	
	@BeforeClass
	public void setUp(String str) {
		
		if(str.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONIKA\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		driver=new ChromeDriver();
		driver.get("baseURL");

		}
		else  {
			System.out.println("Browser not working");			
    }
	}
	@BeforeSuite   
	public void setReport() 
	{
       sparkReporter=new ExtentSparkReporter("C:\\Users\\MONIKA\\eclipse-workspace\\M_project\\Records\\"+".html");
	   report=new ExtentReports();
	   report.attachReporter(sparkReporter);
	  
	   report.setSystemInfo("Operating System", "Windows");
	   report.setSystemInfo("Environment", "QA");
	   sparkReporter.config().setReportName("Integration Test Execution");
	   sparkReporter.config().setDocumentTitle("QA Automation Testing Report");
	   sparkReporter.config().setTheme(Theme.STANDARD);
	}	
	
  public static String captureScreen() throws IOException {
	 File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String dest="C:\\Users\\MONIKA\\eclipse-workspace\\M_project\\Screenshots"+".png";
	FileUtils.copyFile(source, new File(dest));
	return  dest;
  }
	@AfterClass
	public void closeBrowser() {
		driver.quit();
}
	@AfterSuite
	public void endreport()
	{
		report.flush();
	}
}
