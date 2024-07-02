package Form.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TopsDemo {
	
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		  WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	 	  driver.get("https://careercenter.tops-int.com/");
	 	 
	 	 driver.findElement(By.id("mobile")).sendKeys("6353641306");
   	     Thread.sleep(1000);
   	     
   		 driver.findElement(By.id("password")).sendKeys("6353641306");
  	     Thread.sleep(1000);
  	     
  		 driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input")).click();
  		 
  		 
  		 System.setProperty("webdriver.edge.driver","C:\\Driver1\\edgedriver_win64\\msedgedriver.exe");

  	     WebDriver driver2 = new EdgeDriver();
  	     
  	     driver2.manage().window().maximize();
  		 driver2.get("https://careercenter.tops-int.com/");
  		 Thread.sleep(3000);
  		 

	 	 driver2.findElement(By.id("mobile")).sendKeys("6353641306");
   	     Thread.sleep(1000);
   	     
   		 driver2.findElement(By.id("password")).sendKeys("6353641306");
  	     Thread.sleep(1000);
  	     
  		 driver2.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input")).click();
  		 
  	     }

}
