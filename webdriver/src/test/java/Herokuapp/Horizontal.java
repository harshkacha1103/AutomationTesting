package Herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class Horizontal {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = DriverConnection.getconnection("https://the-internet.herokuapp.com/");
		 
		 WebElement h = driver.findElement(By.linkText("Horizontal Slider"));
	     h.click();
	     
	     WebElement slider = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/input"));
	     WebElement slider2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/input"));
	     
	     Thread.sleep(1000);
	     
	     Actions action = new Actions(driver);
	     action.dragAndDropBy(slider, 50, 0).perform();
	     
	     Thread.sleep(1000);
	     action.dragAndDropBy(slider, -40, 0).perform();
	}

}


