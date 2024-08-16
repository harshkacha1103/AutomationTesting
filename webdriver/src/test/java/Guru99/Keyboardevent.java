package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class Keyboardevent {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverConnection.getconnection("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement search  = driver.findElement(By.name("firstName"));
		Actions builder = new Actions(driver);
		
		builder.click(search)
		.keyDown(Keys.SHIFT)
		.sendKeys("Harsh")
		.keyUp(Keys.SHIFT)
//		.sendKeys(Keys.ENTER)
		.build()
		.perform();
		
		WebElement lname  = driver.findElement(By.name("lastName"));
		lname.sendKeys("Kacha");
		
		Thread.sleep(1000);
		
		WebElement ph  = driver.findElement(By.name("phone"));
		ph.sendKeys("9687451214");
		
		Thread.sleep(1000);
		
		WebElement em  = driver.findElement(By.name("userName"));
		em.sendKeys("abc@gmail.com");
		
		Thread.sleep(1000);
		
		WebElement Add  = driver.findElement(By.name("address1"));
		Add.sendKeys("Tops tech kotecha chowk");
		
		Thread.sleep(1000);
		
		WebElement city  = driver.findElement(By.name("city"));
		city.sendKeys("Rajkot");
		
		Thread.sleep(1000);
		
		WebElement State  = driver.findElement(By.name("state"));
		State.sendKeys("Gujarat");
		
		Thread.sleep(1000);
		
		WebElement post  = driver.findElement(By.name("postalCode"));
		post.sendKeys("101");
		
		   WebElement co = driver.findElement(By.name("country"));
			Actions builder1 = new Actions(driver);
			builder1.click(co).sendKeys("INDIA").sendKeys(Keys.ENTER).build().perform();
			
			Thread.sleep(1000);
			
			
			WebElement us  = driver.findElement(By.name("email"));
			Actions builder2 = new Actions(driver);
			
			builder2.click(us)
			.keyDown(Keys.SHIFT)
			.sendKeys("yash@gmail.com")
			.keyUp(Keys.SHIFT)
//			.sendKeys(Keys.ENTER)
			.build()
			.perform();
			
			
			Thread.sleep(1000);
			
			WebElement pss  = driver.findElement(By.name("password"));
			pss.sendKeys("12345678");
			
			Thread.sleep(1000);
			
			WebElement css  = driver.findElement(By.name("confirmPassword"));
			css.sendKeys("12345678");
			
			Thread.sleep(1000);
		
			WebElement btn  = driver.findElement(By.name("submit"));
			btn.click();
			
			driver.quit();
	}
	
	

}
