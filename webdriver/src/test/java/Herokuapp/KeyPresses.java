package Herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class KeyPresses 
{
         public static void main(String[] args) throws InterruptedException {
			
		
	   WebDriver driver = DriverConnection.getconnection("https://the-internet.herokuapp.com/");
		 
		 WebElement drg = driver.findElement(By.linkText("Key Presses"));
	     drg.click();
	     
	 	WebElement search  = driver.findElement(By.id("target"));
		Actions builder = new Actions(driver);
		
		builder.click(search)
		.keyDown(Keys.SHIFT)
		.sendKeys("tops career center")
		.keyUp(Keys.SHIFT)
		.sendKeys(Keys.ENTER)
		.build()
		.perform();
		
		Thread.sleep(1000);

   }
}