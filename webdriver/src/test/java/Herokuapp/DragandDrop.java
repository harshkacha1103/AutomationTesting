package Herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class DragandDrop {
	
	public static void main(String[] args) throws InterruptedException {
       WebDriver driver = DriverConnection.getconnection("https://the-internet.herokuapp.com/");
		 
		 WebElement drg = driver.findElement(By.linkText("Drag and Drop"));
	     drg.click();
	     

			
			WebElement from = driver.findElement(By.id("column-a"));//img
			Thread.sleep(1000);
			WebElement to = driver.findElement(By.id("column-b"));//container
			
			Actions builder = new Actions(driver);
			
	        Action dd =builder.clickAndHold(from).moveToElement(to).release().build();
			
			dd.perform(); 
	}

}
