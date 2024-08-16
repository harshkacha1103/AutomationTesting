package Testnextng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.DriverConnection;


public class Parameterised_login_multi {
	
static WebDriver driver;
	
	@BeforeClass
	public static void openBrowser()
	{
		driver = DriverConnection.getconnection("https://www.facebook.com/");
	}
	
	@Test(dataProvider = "dp")
	public void logintest(String email, String pass) throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement username =  driver.findElement(By.id("email"));
		username.clear();
		username.sendKeys(email);
		WebElement password =  driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys(pass);
	}
	
	@DataProvider(name="dp")
	public static Object[][] data()
	{
		Object obj[][] = new Object[3][2];
		
		obj[0][0] = "tops@gmail.com";
		obj[0][1] = "tops123";
		
		obj[1][0] = "abc@gmail.com";
		obj[1][1] = "tops123";
		
		obj[2][0] = "xyz@gmail.com";
		obj[2][1] = "tops123";
		
		return obj;
	}

}
