package Form.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
    	 driver.get("https://www.facebook.com/");
    	 
    	 driver.findElement(By.linkText("Create new account")).click();
    	 Thread.sleep(1000);
    	 
    	 driver.findElement(By.name("firstname")).sendKeys("harsh");
    	 Thread.sleep(1000);
    	 
    	 driver.findElement(By.name("lastname")).sendKeys("kacha");
    	 Thread.sleep(1000);
    	 
    	 driver.findElement(By.name("reg_email__")).sendKeys("harsh@gmail.com");
    	 Thread.sleep(1000);
    	 
    	 driver.findElement(By.name("reg_email_confirmation__")).sendKeys("harsh@gmail.com");
    	 Thread.sleep(1000);
    	 
    	 driver.findElement(By.id("password_step_input")).sendKeys("tops?123");
    	 Thread.sleep(1000);
    	 
    	 WebElement day = driver.findElement(By.id("day"));
    	 Select days = new Select(day);
    	 days.selectByVisibleText("10");
    	 
    	 WebElement month  = driver.findElement(By.id("month"));
    	 Select months = new Select(month);
    	 months.selectByVisibleText("Aug");
    	
    	 
    	 WebElement year  = driver.findElement(By.id("year"));
    	 Select years = new Select(year);
    	 years.selectByVisibleText("1990");
    	
    	 
    	 List<WebElement> gender = driver.findElements(By.name("sex"));
    	 gender.get(1).click();
    	 
    	 Thread.sleep(1000);
    	 
    	 driver.findElement(By.name("websubmit")).click();
	}

}
