package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S10_class {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MONIKA\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().deleteAllCookies();
		WebElement a=driver.findElement(By.xpath("//input[@value='bmw']"));  //radio buttons
		WebElement b=driver.findElement(By.xpath("//input[@value='honda']"));
		WebElement c=driver.findElement(By.xpath(("//input[@id='hondacheck']"))); //check box
		WebElement d=driver.findElement(By.xpath(null));
	}

}
