package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverConnection.getconnection("https://demo.guru99.com/test/newtours/register.php");
		
		Thread.sleep(1000);

         JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement ele =  driver.findElement(By.id("email"));
		
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		Thread.sleep(1000);
		

		   WebElement co = driver.findElement(By.name("country"));
			Actions builder = new Actions(driver);
			builder.click(co).sendKeys("INDIA").sendKeys(Keys.ENTER).build().perform();
 }
}