package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class MouseHover {
	
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = DriverConnection.getconnection("https://demo.guru99.com/test/newtours/register.php");
	
	Thread.sleep(1000);
	
	WebElement home = driver.findElement(By.linkText("Home"));
	WebElement flights = driver.findElement(By.linkText("Flights"));
	WebElement hotels = driver.findElement(By.linkText("Hotels"));
	WebElement car = driver.findElement(By.linkText("Car Rentals"));
	WebElement crus = driver.findElement(By.linkText("Cruises"));
	WebElement destination = driver.findElement(By.linkText("Destinations"));
	WebElement Vacation = driver.findElement(By.linkText("Vacations"));
	
	
    Actions builder = new Actions(driver);
	
	

	
	builder.moveToElement(home).build().perform();
	Thread.sleep(1000); 
	
	builder.moveToElement(flights).build().perform();
	Thread.sleep(1000);
	
	builder.moveToElement(hotels).build().perform();
	Thread.sleep(1000);
	
	builder.moveToElement(car).build().perform();
	Thread.sleep(1000);
	
	builder.moveToElement(crus).build().perform();
	Thread.sleep(1000);
	
	builder.moveToElement(destination).build().perform();
	Thread.sleep(1000);
	
	builder.moveToElement(Vacation).build().perform();
	Thread.sleep(1000);
	
	

}
}