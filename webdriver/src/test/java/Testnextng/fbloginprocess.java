package Testnextng;

import static org.junit.Assert.fail;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import util.DriverConnection;

public class fbloginprocess {
	
 WebDriver driver = DriverConnection.getconnection("https://www.facebook.com/");
	 
	 @Test
		 public void login() throws InterruptedException
			{
			
				driver.findElement(By.name("email")).sendKeys("your_email@example.com");
				Thread.sleep(2000);
				driver.findElement(By.name("pass")).sendKeys("your_password");
				Thread.sleep(2000);
				driver.findElement(By.name("login")).click();
				Thread.sleep(3000);
				if(driver.getCurrentUrl().equals("https://www.facebook.com/"))
				{
					System.out.println("Your Login Test hasbeen passed...");
				}
				else
				{
					System.out.println("Your Login Test hasbeen Failed...");
					fail();
				}
			}

}
