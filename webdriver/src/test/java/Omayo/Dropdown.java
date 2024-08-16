package Omayo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class Dropdown {
	
	public static void main(String[] args) 
	
	{
		WebDriver driver = DriverConnection.getconnection("https://omayo.blogspot.com/");
		
		WebElement State = driver.findElement(By.id("drop1"));
			Actions builder = new Actions(driver);
			builder.click(State).sendKeys("doc 1").sendKeys(Keys.ENTER).build().perform();
	}

}
