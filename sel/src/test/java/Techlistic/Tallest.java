package Techlistic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.MyConnection;

public class Tallest {
	
	 public static void main(String[] args) {
	        
		 WebDriver driver = MyConnection.getconnection("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");

		  try {           
	          
	            Thread.sleep(2000);

	            // Find all rows in table
	            List<WebElement> rows = driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr"));

	            // Create a list to store heights and structures
	            List<Double> heights = new ArrayList<>();
	            List<String> structures = new ArrayList<>();

	            for (int i = 1; i <= rows.size(); i++) {
	                String structure = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody/tr[" + i + "]/td[1]")).getText();
	                String heightStr = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody/tr[" + i + "]/td[4]")).getText();
	                double height = Double.parseDouble(heightStr.replace(" m", ""));
	                heights.add(height);
	                structures.add(structure);
	            }
	         
	        
	            List<Double> sortedHeights = new ArrayList<>(heights);
	            Collections.sort(sortedHeights, Collections.reverseOrder());

	            
	            double secondTallestHeight = sortedHeights.get(1);

	           
	            String secondTallestStructure = "";
	            for (int i = 0; i < heights.size(); i++) 
	            {
	                if (heights.get(i) == secondTallestHeight) 
	                {
	                    secondTallestStructure = structures.get(i);
	                    break;
	                }
	            }

	            System.out.println("tallest structure is " + secondTallestStructure + " with a height of " + secondTallestHeight + " 829m.");

	        } 
		  
		  catch (InterruptedException e) 
		  {
	            e.printStackTrace();
	        
		  } 
		  
		  finally {
	           
	            
	        }
	    }

}
