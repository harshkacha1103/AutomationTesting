package jqueryui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = DriverConnection.getconnection("https://jqueryui.com/");
		 
		 WebElement menu = driver.findElement(By.linkText("Selectmenu"));
	     menu.click();
	     
	     Thread.sleep(1000);
	     
	     driver.switchTo().frame(0);
	     driver.findElement(By.cssSelector("#speed-button > .ui-selectmenu-text")).click();
	     driver.findElement(By.id("ui-id-1")).click();

	     
	     Thread.sleep(1000);
	     
	     driver.findElement(By.cssSelector("#files-button > .ui-selectmenu-text")).click();
	     driver.findElement(By.id("ui-id-7")).click();
	     
	     Thread.sleep(1000);
	 
	     
	     driver.quit();

	     

	  }
	}

	     

			
			
