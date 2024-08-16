package Seleniumassignment.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class demo {
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = DriverConnection.getconnection("https://www.demoblaze.com/index.html");
		
		WebElement contact = driver.findElement(By.linkText("Contact"));
     	contact.click();
     	
     	Thread.sleep(1000);
     	
     	Actions builder = new Actions(driver);
        builder.keyDown(Keys.ESCAPE).perform();
  


 }
}