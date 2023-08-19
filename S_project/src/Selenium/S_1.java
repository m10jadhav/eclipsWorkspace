// how to take screenshot

package Selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  

                                                  
public class S_1 {
   public static void main(String[] args) throws Exception     {
	System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().deleteAllCookies();
    driver.get("https://demoqa.com/buttons");
    File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
    File dest = new File("C:\\Users\\MONIKA\\Documents\\screenshot\\"+".jpg");
    		              //C:\Users\MONIKA\eclipse-workspace\screenshots
                          //C:\Users\MONIKA\eclipse-workspace\screenshots\
    //C:\Users\MONIKA\eclipse-workspace\screenshots
    		                     
    	
			FileUtils.copyFile(file,dest);
		 
    	 }
}
