package Omayo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class hover {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverConnection.getconnection("https://omayo.blogspot.com/");
		
		 WebElement sell = driver.findElement(By.linkText("Home"));
			WebElement mobile = driver.findElement(By.linkText("Blogs"));
			
			
			
			Actions builder = new Actions(driver);
			
			
			builder.moveToElement(sell).build().perform();
			Thread.sleep(2000);
			
			builder.moveToElement(mobile).build().perform();
			Thread.sleep(2000);
	}

}
