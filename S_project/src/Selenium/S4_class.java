
	//handle dropDown by select method

package Selenium;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	public class S4_class
	{

      public static void main(String []args) throws InterruptedException
	   {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONIKA\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().deleteAllCookies();
		   driver.get("https://www.amazon.com/");
		   WebElement allItems =driver.findElement(By.xpath("//select[@name='url']"));
		   
		   Select Item = new Select(allItems);
		   Item.selectByIndex(5);
		   Thread.sleep(3000);
		   Item.selectByValue("search-alias=electronics-intl-ship");
		   Thread.sleep(4000);
		   Item.selectByVisibleText("Computers");
		   Thread.sleep(2000);
		  
	   }
	}
