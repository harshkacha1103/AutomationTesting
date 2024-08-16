package Orangehrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class Adminmousevent 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
	
	WebDriver driver = DriverConnection.getconnection("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	Thread.sleep(1000);
	
	
	WebElement use = driver.findElement(By.name("username"));
	use.sendKeys("Admin");
	
	Thread.sleep(1000);
	
	WebElement pass = driver.findElement(By.name("password"));
	pass.sendKeys("admin123");
	
	Thread.sleep(1000);

	WebElement btn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	btn.click();
	
	Thread.sleep(1000);
	
	WebElement admin = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]"));
	admin.click();
	
	Thread.sleep(1000);
	
	WebElement job = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]"));
	WebElement Que = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]"));
	WebElement fashion = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[5]"));
	
	Actions builder = new Actions(driver);
	
	
	builder.moveToElement(job).build().perform();
	Thread.sleep(2000);
	
	builder.moveToElement(Que).build().perform();
	Thread.sleep(2000);
	
	builder.moveToElement(fashion).build().perform();
	Thread.sleep(2000);
	
	driver.quit();

 }
}