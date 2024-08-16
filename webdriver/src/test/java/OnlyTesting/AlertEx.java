package OnlyTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class AlertEx {
	
	public static void main(String[] args) throws InterruptedException 
	{
	
	WebDriver driver = DriverConnection.getconnection("https://only-testing-blog.blogspot.com/");
	
	 WebElement name = driver.findElement(By.xpath("//*[@id=\"post-body-6455223446070396919\"]/div[1]/form/input[1]"));
     name.sendKeys("Harsh");
     
     Thread.sleep(1000);
     
	 WebElement lame = driver.findElement(By.xpath("//*[@id=\"post-body-6455223446070396919\"]/div[1]/form/input[2]"));
     lame.sendKeys("Kacha");
     
     Thread.sleep(1000);
     
     
    
     WebElement btn = driver.findElement(By.id("submitButton"));
     btn.click();
     
     Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
     

}

}