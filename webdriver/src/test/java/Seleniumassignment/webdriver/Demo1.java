package Seleniumassignment.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class Demo1 {
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = DriverConnection.getconnection("https://www.demoblaze.com/index.html");
		
		WebElement Home = driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));
		WebElement supp = driver.findElement(By.linkText("Contact"));
		WebElement About  = driver.findElement(By.linkText("About us"));
		WebElement cart  = driver.findElement(By.linkText("Cart"));
		WebElement login  = driver.findElement(By.linkText("Log in"));
		WebElement Sign   = driver.findElement(By.linkText("Sign up"));
		
		
        Actions builder = new Actions(driver);
		
		builder.moveToElement(Home).build().perform();
		Thread.sleep(1000); 
		
		builder.moveToElement(supp).build().perform();
		Thread.sleep(1000);
		
		builder.moveToElement(About).build().perform();
		Thread.sleep(1000);
		
		builder.moveToElement(cart).build().perform();
		Thread.sleep(1000);
		
		builder.moveToElement(login).build().perform();
		Thread.sleep(1000);
		
		builder.moveToElement(Sign).build().perform();
		Thread.sleep(1000);

 }
}