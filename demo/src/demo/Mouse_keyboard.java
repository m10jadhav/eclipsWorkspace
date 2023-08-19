package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_keyboard {
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONIKA\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		WebElement doubleclk= driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement Rteclk = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement click= driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(doubleclk).doubleClick().build().perform();
		act.moveToElement(Rteclk).contextClick().build().perform();
		act.moveToElement(click).click(click).build().perform();
	}
}
