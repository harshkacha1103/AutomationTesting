package Gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class Create {

	
	public static void main(String[] args) throws InterruptedException 
	{
	
	WebDriver driver = DriverConnection.getconnection("https://accounts.google.com/");
	

	WebElement btn = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[1]/div/button/span"));
	btn.click();
	
	Thread.sleep(1000);
	

	
	WebElement p1 = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[3]"));
	p1.click();
	
	Thread.sleep(1000);
	
	
	
	WebElement fname = driver.findElement(By.id("firstName"));
	fname.sendKeys("Harsh");
	
	Thread.sleep(1000);
	
	
	
	WebElement lname = driver.findElement(By.id("lastName"));
	lname.sendKeys("Kacha");
	
	Thread.sleep(1000);
	
	
	WebElement next = driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span"));
	next.click();
	
	Thread.sleep(1000);
	
	
	
	WebElement mo = driver.findElement(By.id("month"));
    mo.sendKeys("April");
    
	
	Thread.sleep(1000);
	
	WebElement d = driver.findElement(By.id("day"));
    d.sendKeys("11");
    
    Thread.sleep(1000);
    
    WebElement y = driver.findElement(By.id("year"));
    y.sendKeys("2010");
    
    Thread.sleep(1000);
    
    WebElement gen = driver.findElement(By.id("gender"));
    gen.sendKeys("male");
    
    Thread.sleep(1000);
    
    WebElement next1 = driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span"));
	next1.click();
	
    Thread.sleep(1000);
    
    
    WebElement co = driver.findElement(By.id("selectionc2"));
   	co.click();
   	
   	Thread.sleep(1000);
   	
    WebElement next2 = driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span"));
   	next2.click();
   	
   	Thread.sleep(1000);
   	
    WebElement pass = driver.findElement(By.name("Passwd"));
    pass.sendKeys("H4762311");
    
	Thread.sleep(1000);
	
	WebElement cass = driver.findElement(By.name("PasswdAgain"));
    cass.sendKeys("H4762311");
    
	Thread.sleep(1000);
	
	
	
	WebElement sass = driver.findElement(By.id("selectionc6"));
    sass.click();
    
    Thread.sleep(1000);
    

    
    WebElement next3 = driver.findElement(By.xpath("//*[@id=\"createpasswordNext\"]/div/button/span"));
   	next3.click();
   	
   	Thread.sleep(1000);
   	
   	WebElement pnum = driver.findElement(By.id("phoneNumberId"));
    pnum.sendKeys("6353641306");
    
	Thread.sleep(1000);
	
	
	
	WebElement next4 = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div/div/div/button/span"));
   	next4.click();
   	
	Thread.sleep(1000);
	
	WebElement code = driver.findElement(By.id("code"));
   	code.sendKeys("136813");
	
  
   	
   	Thread.sleep(1000);
   	
   	WebElement next5 = driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/div[3]"));
   	next5.click();
	
   }

}