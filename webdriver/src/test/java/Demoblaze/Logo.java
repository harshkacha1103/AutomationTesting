package Demoblaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class Logo {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverConnection.getconnection("https://www.demoblaze.com/");
		
		
		Thread.sleep(1000);
		
		WebElement Logo = driver.findElement(By.xpath("//*[@id=\"nava\"]"));
		Logo.click();
 }
}