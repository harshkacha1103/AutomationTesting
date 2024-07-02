package Form.basic;

import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Saucedemo 
{
	
  public static void main(String[] args) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
 	  driver.get("https://www.saucedemo.com/");
 	  
 	     driver.findElement(By.name("user-name")).sendKeys("problem_user");
	     Thread.sleep(1000);
	     
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
	     Thread.sleep(1000);
	     
	     driver.findElement(By.name("login-button")).click();
	     Thread.sleep(1000);
	     
	     driver.findElement(By.id("react-burger-menu-btn")).click();
	     Thread.sleep(1000);
	     
//	     driver.findElement(By.id("about_sidebar_link")).click();
//          Thread.sleep(1000);
	     
	     driver.findElement(By.id("inventory_sidebar_link")).click();
	     Thread.sleep(1000);
	     
	     driver.findElement(By.id("reset_sidebar_link")).click();
	     Thread.sleep(1000);
  		 
	     driver.findElement(By.linkText("Logout")).click();
	     Thread.sleep(1000);
	     
         driver.quit();
         
         
         System.setProperty("webdriver.edge.driver","C:\\Driver1\\edgedriver_win64\\msedgedriver.exe");
         
         WebDriver driver2 = new EdgeDriver();
         driver2.manage().window().maximize();
         driver2.get("https://www.saucedemo.com/");
         
         driver2.findElement(By.name("user-name")).sendKeys("problem_user");
         Thread.sleep(1000);
         
         driver2.findElement(By.id("password")).sendKeys("secret_sauce");
         Thread.sleep(1000);
         
         driver2.findElement(By.name("login-button")).click();
         Thread.sleep(1000);
         
         driver2.findElement(By.id("react-burger-menu-btn")).click();
         Thread.sleep(1000);
         
         driver2.findElement(By.id("inventory_sidebar_link")).click();
         Thread.sleep(1000);
         
         
         driver2.findElement(By.id("reset_sidebar_link")).click();
         Thread.sleep(1000);
         
         driver2.findElement(By.linkText("Logout")).click();
         Thread.sleep(1000);
         
         driver.quit();
}  

}
