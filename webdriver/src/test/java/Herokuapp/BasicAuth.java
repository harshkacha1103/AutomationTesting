package Herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConnection;

public class BasicAuth {
	  public static void main(String[] args) {
		  WebDriver driver = DriverConnection.getconnection("https://the-internet.herokuapp.com/");
		  
		  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		  
		 String text =  driver.findElement(By.cssSelector("p")).getText();
		 System.out.println(text);
	}

}
