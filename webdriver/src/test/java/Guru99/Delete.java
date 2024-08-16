package Guru99;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class Delete {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverConnection.getconnection("https://demo.guru99.com/test/delete_customer.php");
		
		WebElement cid  = driver.findElement(By.name("cusid"));
		cid.sendKeys("101");
		
		Thread.sleep(1000);
		
		WebElement btn  = driver.findElement(By.name("submit"));
		btn.click();
		
		Thread.sleep(1000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();

		Thread.sleep(1000);
		
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		Thread.sleep(2000);
		alert2.accept();
}
}