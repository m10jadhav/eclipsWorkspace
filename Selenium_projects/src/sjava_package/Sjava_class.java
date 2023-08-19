

package sjava_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sjava_class
{
   public static void main(String []args)  //
  // throws InterruptedException
   {
	   System.setProperty("webdriver.chrome,driver","\"C:\\Users\\MONIKA\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	  
	// Thread.sleep(2000); 
	    // Thread.sleep(2000);                      // to increase the delay time
	  
	   driver.navigate().to("https://www.google.com/");     // to open the url by
	                                                         // navigate method
   }
   }	   