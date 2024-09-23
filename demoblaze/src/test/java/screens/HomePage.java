package screens;

import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import util.MyConnection;

public class HomePage {
	
	static WebDriver driver;

	@Test
	public void a1homepageopen() throws InterruptedException
	{
		 driver = MyConnection.getconnection("https://www.demoblaze.com/");
		Thread.sleep(1000);
		
	}
	
	@Test
	public void a2logocheck() throws InterruptedException
	{
	
		driver.findElement(By.xpath("//*[@id=\"nava\"]/img")).click();
		
	}
	
  @Test
  
  public void a3headeroptionsclick() throws InterruptedException
	{
		
		System.out.println("\n Enter 1 For Home Page");
		System.out.println("\n Enter 2 For Contact Page");
		System.out.println("\n Enter 3 For About Page");
		System.out.println("\n Enter 4 For Cart Page");
		System.out.println("\n Enter 5 For Login Page");
		System.out.println("\n Enter 6 For Signup Page");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		switch(num)
		{
		
			case 1:
				driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
				
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
			break;	
			
			case 2:
				driver.findElement(By.linkText("Contact")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.id("recipient-email")).sendKeys("a@gmail.com");
				driver.findElement(By.id("recipient-name")).sendKeys("admin");
				driver.findElement(By.id("message-text")).sendKeys("test");
				driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
				Alert alert = driver.switchTo().alert();
			    Thread.sleep(1000);
			    alert.accept();
		
			break;	
				
			case 3:
				driver.findElement(By.linkText("About us")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button")).click();
			break;	
				
			case 4:
				break;	
				
			case 5:
				break;	
				
			case 6:
				break;	
		
		}
		

	}
}
