package HerokuTestpages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class Aleartex {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = DriverConnection.getconnection("https://testpages.eviltester.com/styled/index.html");
		 
		
		 WebElement btn = driver.findElement(By.linkText("Alerts (JavaScript)"));
	     btn.click();
	     
	     Thread.sleep(1000);

	     
	     WebElement shbox = driver.findElement(By.id("alertexamples"));
	     shbox.click();
	     
	       Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(1000);
			alert.accept();
			
			Thread.sleep(1000);
			
			 WebElement scbox = driver.findElement(By.id("confirmexample"));
		     scbox.click();
		     
		        Alert alert1 = driver.switchTo().alert();
				System.out.println(alert1.getText());
				Thread.sleep(1000);
				alert1.accept();
				
				Thread.sleep(1000);
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				WebElement ele =  driver.findElement(By.id("promptexample"));
				
				js.executeScript("arguments[0].scrollIntoView();", ele);
				
				Thread.sleep(1000);
				
				 WebElement prbox = driver.findElement(By.id("promptexample"));
			     prbox.click();
			     
			     Alert alert2 = driver.switchTo().alert();
			     System.out.println(alert2.getText());
			     alert.sendKeys("Typing1234..");
				 alert.accept();
				
				

  }
}