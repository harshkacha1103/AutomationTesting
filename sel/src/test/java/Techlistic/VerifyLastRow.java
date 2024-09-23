package Techlistic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.MyConnection;

public class VerifyLastRow {
	
	 public static void main(String[] args) {
	        
		 WebDriver driver = MyConnection.getconnection("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		 
		 try {
	            

	            Thread.sleep(2000); 

	            // Verify that the 6th row 
	            WebElement lastRow = driver.findElement(By.xpath("//table[@summary='Sample Table']/tfoot/tr"));
	            List<WebElement> lastRowColumns = lastRow.findElements(By.tagName("td"));
	            System.out.println("Last Row Data:");
	            for (WebElement column : lastRowColumns) {
	                System.out.println(column.getText());
	            }
	            if (lastRowColumns.size() == 2) 
	            {
	                System.out.println("Verified: The last row has exactly 2 columns.");
	            } else 
	            {
	                System.out.println("Verification Failed: The last row does not have exactly 2 columns.");
	            }
	            
	        } 
		    catch (InterruptedException e) 
		    {
	            e.printStackTrace();
	        } 
		 finally {
	           
	            
	        }

}
}