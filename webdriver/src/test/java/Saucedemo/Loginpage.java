package Saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class Loginpage {
	
	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver = DriverConnection.getconnection("https://www.saucedemo.com/");
		 
		 WebElement name = driver.findElement(By.name("user-name"));
	     name.sendKeys("standard_user");
	     
	     Thread.sleep(1000);
	     
	     WebElement pass = driver.findElement(By.name("password"));
	     pass.sendKeys("secret_sauce");
	     
	     Thread.sleep(1000);
	     
	     WebElement btn = driver.findElement(By.name("login-button"));
	     btn.click();
	     
	     Thread.sleep(1000);
	     
	     WebElement btn1 = driver.findElement(By.id("react-burger-menu-btn"));
	     btn1.click();
	     
	     Thread.sleep(1000);
	     
	     WebElement alink = driver.findElement(By.partialLinkText("All Ite"));
	     alink.click();
	     
	     Thread.sleep(1000);
	     
	     
	     WebElement reset = driver.findElement(By.partialLinkText("Reset App Sta"));
	     reset.click();
	   
	     Thread.sleep(1000);
	     
	     JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement ele =  driver.findElement(By.linkText("Test.allTheThings() T-Shirt (Red)"));
			
			js.executeScript("arguments[0].scrollIntoView();", ele);
	    
			  Thread.sleep(1000);
	     
			     WebElement log = driver.findElement(By.linkText("Logout"));
			     log.click();
	     
			     driver.quit();

	     
	     
	}

}
