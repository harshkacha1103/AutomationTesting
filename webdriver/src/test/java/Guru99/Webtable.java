package Guru99;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class Webtable {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = DriverConnection.getconnection("https://demo.guru99.com/test/web-table-element.php");
//		 
//		 List<WebElement>  row = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
//		 
//		 System.out.println(row.size());
//		 
//		 List<WebElement> col = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
//		 
//		 System.out.println(col.size());
		
		 List<WebElement>  rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
			
			List<WebElement> header =  driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/th"));
			for(int i=1;i<=header.size();i++)
			{
				String data =  driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/th["+i+"]")).getText();
				System.out.print(data+" ");
			}
			
			
			for(int i=1;i<=rows.size();i++)
			{
				List<WebElement>  cols = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td"));
				for(int j=1;j<=cols.size();j++)
				{
					String data = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.print(data+" ");
				}
				System.out.println();
			}
			 
			Thread.sleep(3000);
 }
}