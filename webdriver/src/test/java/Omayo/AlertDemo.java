package Omayo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class AlertDemo {
	
public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver = DriverConnection.getconnection("https://omayo.blogspot.com/");
		
		WebElement shbox = driver.findElement(By.id("alert1"));
	     shbox.click();
	     
	       Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();

			Thread.sleep(1000);
			
			WebElement shbox1 = driver.findElement(By.id("prompt"));
		     shbox1.click();
		     
		    
		     
				Alert alert1 = driver.switchTo().alert();
				System.out.println(alert1.getText());
				alert1.sendKeys("hasgsg");
				alert1.accept();
				
				Thread.sleep(1000);
				
				WebElement shbox2 = driver.findElement(By.id("confirm"));
			     shbox2.click();
			     
			    Thread.sleep(1000);
			     
					Alert alert2 = driver.switchTo().alert();
					System.out.println(alert2.getText());
					alert2.accept();
}
}