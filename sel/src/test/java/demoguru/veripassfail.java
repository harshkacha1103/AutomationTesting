package demoguru;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.MyConnection;

public class veripassfail {
	
	public static void main(String[] args) throws InterruptedException, IOException 
    {
   	
         WebDriver driver = MyConnection.getconnection("https://demo.guru99.com/");
		
		WebElement emai  = driver.findElement(By.name("emailid"));
		emai.sendKeys("abc@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement btn  = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input"));
		btn.click();

}
}