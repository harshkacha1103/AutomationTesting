package Form.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagramdemo {
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver-win64\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
 	 driver.get("https://www.instagram.com/");
 	 
 	 driver.findElement(By.name("username")).sendKeys("harsh");
	 Thread.sleep(1000);
	 
//	 driver.findElement(By.name("password")).sendKeys("12345678");
//	 Thread.sleep(1000);
	 
	 driver.findElement(By.name("password")).sendKeys("12345678");
	 Thread.sleep(1000);
	 
	 
	 driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div")).click();
	
	  
	  
}
}
