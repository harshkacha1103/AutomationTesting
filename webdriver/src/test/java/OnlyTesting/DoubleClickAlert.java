package OnlyTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class DoubleClickAlert {
	
	public static void main(String[] args) throws InterruptedException 
	{
	
	WebDriver driver = DriverConnection.getconnection("https://only-testing-blog.blogspot.com/");
	
	
	
	 WebElement doubleClickLink = driver.findElement(By.xpath("//*[@id=\"post-body-7297556448793668582\"]/div[1]/button"));     
     
     Actions action = new Actions(driver);
     
     action.doubleClick(doubleClickLink).build().perform();
     
       Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();

 }
}