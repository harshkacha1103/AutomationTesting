package Herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException 
	{
         WebDriver driver = DriverConnection.getconnection("https://the-internet.herokuapp.com/");
       
            WebElement fname = driver.findElement(By.linkText("Dropdown"));
		     fname.click();
		   
		    Thread.sleep(1000);
		
		    WebElement option = driver.findElement(By.id("dropdown"));
			Actions builder = new Actions(driver);
			builder.click(option).sendKeys("Option 1").sendKeys(Keys.ENTER).build().perform();
	}

}
