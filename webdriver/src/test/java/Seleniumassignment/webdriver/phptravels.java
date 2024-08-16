package Seleniumassignment.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConnection;

public class phptravels {
	
	 public static void main(String[] args) throws InterruptedException 
	 {
		 WebDriver driver = DriverConnection.getconnection("https://phptravels.com/demo/");
		 
		WebElement fname = driver.findElement(By.name("first_name"));
 		fname.sendKeys("Harsh");
		
		Thread.sleep(1000);
  		
  		WebElement lname = driver.findElement(By.name("last_name"));
  		lname.sendKeys("Kacha");
  		
  		Thread.sleep(1000);
  		
  	     WebElement State = driver.findElement(By.name("country_id"));
		Actions builder1 = new Actions(driver);
		builder1.click(State).sendKeys("India +91").sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
		
		WebElement num = driver.findElement(By.name("whatsapp"));
		num.sendKeys("6354130251");
		
		Thread.sleep(1000);
		
		WebElement bname = driver.findElement(By.name("business_name"));
		bname.sendKeys("Harsh Kacha");
		
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("harsh@gmail.com");

		
		Thread.sleep(1000);
		
		WebElement num1 = driver.findElement(By.id("numb1"));
		WebElement num2 = driver.findElement(By.id("numb2"));
			
//		String strN1= num1.getText();
	
		int n1= Integer.valueOf(num1.getText());
		int n2= Integer.valueOf(num2.getText());
		
		int answer = n1 + n2;
     	
		
		
		
		WebElement answerElement = driver.findElement(By.id("number"));
		answerElement.sendKeys(Integer.toString(answer));
		
		Thread.sleep(1000);
	
	    WebElement btn = driver.findElement(By.id("demo"));
		btn.click();
		
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement ele =  driver.findElement(By.id("number"));
		
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		
  		
  		
	}

}
