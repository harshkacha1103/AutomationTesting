package Herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class Checkbox {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverConnection.getconnection("https://the-internet.herokuapp.com/");
		
		WebElement fname = driver.findElement(By.linkText("Checkboxes"));
		fname.click();
		
		Thread.sleep(1000);
	
		WebElement check = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		check.click();
		
		Thread.sleep(1000);
		
		driver.close();
	}

}
