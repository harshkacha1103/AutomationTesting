package Techlistic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.MyConnection;

public class Task1 {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = MyConnection.getconnection("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");

		
		 List<WebElement>  rows = driver.findElements(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tbody/tr"));
		
		//*[@id="post-body-1325137018292710854"]/div[1]/div[1]/div[5]/table/tbody/tr[1]
		 

			List<WebElement> header =  driver.findElements(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tbody/tr[1]/th"));
			for(int i=1;i<=header.size();i++)
			{
				String data =  driver.findElement(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tbody/tr[1]/th["+i+"]")).getText();
				System.out.print(data+" ");
			}
			
			
			for(int i=1;i<=rows.size();i++)
			{
				List<WebElement>  cols = driver.findElements(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tbody/tr["+i+"]/td"));
				for(int j=1;j<=cols.size();j++)
				{
					String data = driver.findElement(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.print(data+" ");
				}
				System.out.println();
			}
			 
			Thread.sleep(3000);
			
			
}

}
