package OnlyTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException 
	{
	
	WebDriver driver = DriverConnection.getconnection("https://only-testing-blog.blogspot.com/");
	
	
	   WebElement box = driver.findElement(By.id("Carlist"));
		Actions builder = new Actions(driver);
		builder.click(box).sendKeys("Toyota").sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
		
       JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement ele =  driver.findElement(By.linkText("TextBox"));
		
		js.executeScript("arguments[0].scrollIntoView();", ele);
   }

}