package Webtable;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.MyConnection;

public class Web {
	
	public static void main(String[] args) throws InterruptedException, IOException 
    {
   	
         WebDriver driver = MyConnection.getconnection("https://demoqa.com/webtables");
         
         WebElement add = driver.findElement(By.xpath("//*[@id=\"edit-record-1\"]"));
 		 add.click();

 		 Thread.sleep(1000);
 		 

 		driver.findElement(By.id("firstName")).click();
 	    driver.findElement(By.id("firstName")).clear();
 	    driver.findElement(By.id("firstName")).sendKeys("Harsh1");
 		 
 		 Thread.sleep(1000);
 		 
 	
 		driver.findElement(By.id("lastName")).click();
 	    driver.findElement(By.id("lastName")).clear();
 	    driver.findElement(By.id("lastName")).sendKeys("Kacha");
 	    
 	   Thread.sleep(1000);
 		 
 	    driver.findElement(By.id("userEmail")).click();
	    driver.findElement(By.id("userEmail")).clear();
	    driver.findElement(By.id("userEmail")).sendKeys("Harsh@example.com");
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("age")).click();
	    driver.findElement(By.id("age")).clear();
	    driver.findElement(By.id("age")).sendKeys("30");
	    
	    Thread.sleep(1000);
	    
	    
	    driver.findElement(By.id("salary")).click();
	    driver.findElement(By.id("salary")).clear();
	    driver.findElement(By.id("salary")).sendKeys("100000");
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("department")).click();
	    driver.findElement(By.id("department")).clear();
	    driver.findElement(By.id("department")).sendKeys("Insurance1");
	    
	    Thread.sleep(1000);
 		 
		 
		 WebElement btn = driver.findElement(By.id("submit"));
		 btn.click();
		 
		 Thread.sleep(1000);
		 
		 WebElement btn1 = driver.findElement(By.xpath("//*[@id=\"delete-record-1\"]"));
		 btn1.click();
		 
   }
}