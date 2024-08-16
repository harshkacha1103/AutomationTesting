package Herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class Hovers {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = DriverConnection.getconnection("https://the-internet.herokuapp.com/");
		 
		 WebElement ho = driver.findElement(By.linkText("Hovers"));
	     ho.click();
	     
	       WebElement sell = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]"));
			WebElement mobile = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]"));
			WebElement fashion = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]"));
			
			
			Actions builder = new Actions(driver);
			
			
			builder.moveToElement(sell).build().perform();
			Thread.sleep(2000);
			
			builder.moveToElement(mobile).build().perform();
			Thread.sleep(2000);
			
			builder.moveToElement(fashion).build().perform();
			Thread.sleep(2000);

}
}