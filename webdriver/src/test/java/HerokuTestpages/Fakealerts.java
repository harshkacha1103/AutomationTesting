package HerokuTestpages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class Fakealerts {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = DriverConnection.getconnection("https://testpages.eviltester.com/styled/index.html");
		 
		
		 WebElement btn = driver.findElement(By.linkText("Fake Alerts"));
	     btn.click();
	     
	     Thread.sleep(1000);
	     
	     WebElement fake = driver.findElement(By.id("fakealert"));
	     fake.click();
	     
	     Thread.sleep(1000);
	        
	     WebElement box = driver.findElement(By.id("dialog-ok"));
	     box.click();
	     
	     Thread.sleep(1000);
	     
	     WebElement mod = driver.findElement(By.id("modaldialog"));
	     mod.click();
	     
	     Thread.sleep(1000);
	     
	     WebElement box1 = driver.findElement(By.id("dialog-ok"));
	     box1.click();
	     
	     driver.quit();
	     
	     

 } 
}