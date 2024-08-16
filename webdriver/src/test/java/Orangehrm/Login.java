package Orangehrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import util.DriverConnection;

public class Login {
	
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
	
	WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"));
	username.sendKeys("Admin");
	
	Thread.sleep(1000);
	
	WebElement role = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]"));
	//role.click();
	//*[@id="app"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]
	
	//*[@id="app"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]
	
	
	Actions builder1 = new Actions(driver);
	builder1.click(role)
	.keyDown(Keys.ARROW_DOWN)
	.keyDown(Keys.ENTER)
	.build()
   .perform();
	
		Thread.sleep(1000);
		
		
		WebElement element = driver.findElement(By.cssSelector(".oxd-table-filter"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();

		
//		WebElement empname = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input"));
//		empname.sendKeys("Automation Tester User");
//		
//		
//		Actions builder3 = new Actions(driver);
//		builder3.click(empname)
//		.keyDown(Keys.ENTER)
//		.keyDown(Keys.ARROW_DOWN)
//		.build()
//	   .perform();
		
		Thread.sleep(1000);
		
		WebElement stuats = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div"));
		
		Actions builder2 = new Actions(driver);
		builder2.click(stuats)
		.keyDown(Keys.ARROW_DOWN)
		.keyDown(Keys.ENTER)
		.build()
	   .perform();
		
		
		Thread.sleep(1000);
		
		
		WebElement btn1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
		btn1.click();
		
		
//	 WebElement role1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div"));
//	 role1.click();
//	
	
	/*
	 * WebElement role = driver.findElement(By.xpath(
	 * "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]"
	 * )); Actions builder = new Actions(driver);
	 * builder.click(role).sendKeys("Admin").sendKeys(Keys.ENTER).build().perform();
	 * .
	 
	 */

//	WebElement role = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]"));
//	 role.click();
//	Select roles = new Select(role);
//	 roles.selectByVisibleText("Admin");
//		Thread.sleep(1000);
	
//	 driver.findElement(By.cssSelector(".oxd-select-text--focus > .oxd-select-text-input")).click();
//	   
//	      WebElement element = driver.findElement(By.cssSelector(".orangehrm-background-container"));
//	      Actions builder = new Actions(driver);
//	      builder.moveToElement(element).release().perform();
//	    }

		
 }
}