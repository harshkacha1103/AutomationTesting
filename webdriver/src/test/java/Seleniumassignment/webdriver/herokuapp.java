package Seleniumassignment.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class herokuapp {
	
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = DriverConnection.getconnection("https://the-internet.herokuapp.com/");
	 
//    	WebElement fname = driver.findElement(By.linkText("Checkboxes"));
//		fname.click();
//		
//		Thread.sleep(1000);
//		
//		WebElement check = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
//		check.click();
//		
//		driver.findElement(By.cssSelector(".btn-success")).click();
//		driver.findElement(By.cssSelector("#orderModal span")).click();
		
//		WebElement context = driver.findElement(By.linkText("Basic Auth"));
//		context.click();
		
	   driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	   
	   String text = driver.findElement(By.cssSelector("p")).getText();
	   System.out.println(text);
}

}
