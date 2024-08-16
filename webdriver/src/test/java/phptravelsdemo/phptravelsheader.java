package phptravelsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class phptravelsheader {
	
	public static void main(String[] args) throws InterruptedException
	{
        WebDriver driver = DriverConnection.getconnection("https://phptravels.com/demo/");
        
        WebElement product = driver.findElement(By.linkText("Product"));
        product.click();
        
        Thread.sleep(1000);
        
		WebElement features = driver.findElement(By.linkText("Features"));
		features.click();
		
		Thread.sleep(1000);
		
		WebElement company = driver.findElement(By.linkText("Company"));
		company.click();
		
		Thread.sleep(1000);
		
		WebElement demo = driver.findElement(By.linkText("Demo"));
		demo.click();

		Thread.sleep(1000);
		
		WebElement pricing = driver.findElement(By.linkText("Pricing"));
		pricing.click();
		
		driver.close();

}
}