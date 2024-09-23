package screens;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Signpage {
	
	
		
		@DataProvider(name="rahul")
		public static Object[][] readExcel() throws InvalidFormatException, IOException
		{
			Object[][] data=null;
				
			String filepath="D:\\Sign.xlsx"; //only string form path
			
			File file=new File(filepath); //to make an file
			
			XSSFWorkbook workbook=new XSSFWorkbook(file);//to open the excel file
			
			
			
			Sheet sheet=workbook.getSheet("Sheet1");//to open the perticular sheet
			
			int nrows=sheet.getPhysicalNumberOfRows();
			System.out.println("no of rows are... "+nrows);
			
			data=new Object[nrows][];
			for(int i=0;i<nrows;i++)//row
			{
				Row row=sheet.getRow(i);//ith row is selection
				int ncols=row.getPhysicalNumberOfCells();
				System.out.println("no of cols are.. "+ncols);
				data[i]=new Object[ncols];
				for(int j=0;j<ncols;j++)//cols
				{
					Cell cell=row.getCell(j);
					cell.setCellType(CellType.STRING);
					data[i][j]=cell.getStringCellValue();
				}
			}
			return data;
		}
		WebDriver driver=null;
		
		@Test(dataProvider = "rahul")
		public void test(String keyword,String data) throws InterruptedException, InvalidFormatException, IOException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\\\Driver\\\\chromedriver-win64\\\\chromedriver.exe");//build up path
			if(keyword.equals("open browser"))
			{			
				driver=new ChromeDriver();//to load the blank browser
			}
			else if(keyword.equals("enter url"))
			{
				driver.get(data);	
				Thread.sleep(2000);
			}
			
			else if(keyword.equals("click hover"))
			{
				driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
				
				WebElement Home = driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));
				WebElement supp = driver.findElement(By.linkText("Contact"));
				WebElement About  = driver.findElement(By.linkText("About us"));
				WebElement cart  = driver.findElement(By.linkText("Cart"));
				WebElement login  = driver.findElement(By.linkText("Log in"));
				WebElement Sign   = driver.findElement(By.linkText("Sign up"));
				
				
		        Actions builder = new Actions(driver);
				
				builder.moveToElement(Home).build().perform();
				Thread.sleep(1000); 
				
				builder.moveToElement(supp).build().perform();
				Thread.sleep(1000);
				
				builder.moveToElement(About).build().perform();
				Thread.sleep(1000);
				
				builder.moveToElement(cart).build().perform();
				Thread.sleep(1000);
				
				builder.moveToElement(login).build().perform();
				Thread.sleep(1000);
				
				builder.moveToElement(Sign).build().perform();
				Thread.sleep(1000);
			}
			
			else if(keyword.equals("click Sign up"))
			{
				driver.findElement(By.linkText("Sign up")).click();
				Thread.sleep(2000);
			}
			
			else if(keyword.equals("enter username"))
			{
				driver.findElement(By.id("sign-username")).sendKeys(data);
				Thread.sleep(2000);
			}
			
			
			else if(keyword.equals("enter Password"))
			{
				driver.findElement(By.id("sign-password")).sendKeys(data);
				Thread.sleep(2000);
			}
			
			
			
			
			else if(keyword.equals("click sign up button"))
				{
						
						File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						File dest=new File("D:\\\\img\\\\12.png");
						FileUtils.copyFile(src, dest);
						Thread.sleep(2000);
				//Assert.fail("Incorrect Contact Email,Name or Message...");
					driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
					Thread.sleep(2000);
					
					
				}    
			
			
			}

}