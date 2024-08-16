package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class Radio {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = DriverConnection.getconnection("https://demo.guru99.com/test/radio.html");
	
	
	WebElement op1 = driver.findElement(By.id("vfb-7-1"));
	op1.click();
	
	Thread.sleep(1000);
	
    WebElement op3 = driver.findElement(By.id("vfb-7-3"));
	op3.click();
	
	if(op3.isEnabled()) 
	{
		System.out.println("Option Three is Enabled");
	}
	
	else 
	{
		System.out.println("Option Three is Not Enabled");
	}
	
	WebElement ch1 = driver.findElement(By.id("vfb-6-0"));
	ch1.click();
	
	Thread.sleep(1000);
	
    WebElement ch3 = driver.findElement(By.id("vfb-6-2"));
	ch3.click();
	
	if(ch3.isSelected()) 
	{
		System.out.println("It is selected");
	}
	
	else 
	{
		System.out.println("It is not selected");
	}
	
	
 }
}