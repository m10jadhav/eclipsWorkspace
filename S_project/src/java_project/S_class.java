//launch multiple browser
package java_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_class
{
    public static void main(String[]args) throws InterruptedException
    {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONIKA\\eclipse-workspace\\chromedriver\\chromedriver.exe");
       
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.google.com/");
       Thread.sleep(3000);
       driver.navigate().to("https://www.facebook.com/");
       Thread.sleep(3000);
       driver.navigate().to("https://www.flipkart.com/");
       Thread.sleep(3000);
       driver.navigate().to("https://www.amazon.com/");
       Thread.sleep(3000);
       driver.navigate().to("https://meesho.com/");
       Thread.sleep(3000);
       driver.navigate().to("https://www.wikipedia.org/");
       Thread.sleep(3000);
       driver.navigate().back();
       Thread.sleep(3000);
       driver.navigate().forward();
       Thread.sleep(3000);
       driver.manage().window().maximize();
       Thread.sleep(3000);
       driver.manage().window().minimize();
       Thread.sleep(3000);
       driver.manage().window().fullscreen();
       Thread.sleep(3000);
       driver.manage().deleteAllCookies();
       Thread.sleep(3000);
       driver.close();
    }
}
