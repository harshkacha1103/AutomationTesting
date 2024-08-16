package Herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class Multiplewindow {
	
	 public static void main(String[] args) throws InterruptedException {
			
			
		   WebDriver driver = DriverConnection.getconnection("https://the-internet.herokuapp.com/");
			 
			 WebElement m = driver.findElement(By.partialLinkText("Multiple Windows"));
		     m.click();
		     
		     driver.findElement(By.linkText("Click Here")).click();

  }
}