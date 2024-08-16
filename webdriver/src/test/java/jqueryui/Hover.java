package jqueryui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class Hover {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = DriverConnection.getconnection("https://jqueryui.com/");
		 
	     
		  
			WebElement Them = driver.findElement(By.linkText("Themes"));
			WebElement supp = driver.findElement(By.linkText("Blog"));
			
			
            Actions builder = new Actions(driver);
			
			
		
			
			builder.moveToElement(Them).build().perform();
			Thread.sleep(2000); 
			
			builder.moveToElement(supp).build().perform();
			Thread.sleep(2000);
			
			driver.quit();
 }
}