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
import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator {
	
	@Test
	public static String[][] readExcel() throws InvalidFormatException, IOException
	{
         String[][] data=null;
		
		String filepath="D:\\cal.xlsx";
		
		File file = new File(filepath);
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
	    Sheet sheet=workbook.getSheet("Sheet1");
		
		int nrows = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows: "+nrows);
		
		data=new String[nrows][];
		
		for(int i=0;i<nrows;i++)
		{
			Row row=sheet.getRow(i);
			int ncols=row.getPhysicalNumberOfCells();
			System.out.println("no of cols are.. "+ncols);
			data[i]=new String[ncols];
			for(int j=0;j<ncols;j++)
			{
				Cell cell=row.getCell(j);
				cell.setCellType(CellType.STRING);
				data[i][j]=cell.getStringCellValue();
			}
		}
		
		
		return data;
	}
	
	WebDriver driver = null;
	
	@Test
	public void test() throws IOException, InterruptedException, InvalidFormatException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver-win64\\chromedriver.exe");//build up path
		String[][] data=readExcel();
		driver=new ChromeDriver();
		driver.get("https://www.calculatorsoup.com/calculators/math/basic.php");	
		
		for(int i=0;i<data.length;i++)
		{
			
			Thread.sleep(2000);
			
			driver.findElement(By.name("cs_display")).sendKeys(data[i][0]);
			Thread.sleep(1000);
			driver.findElement(By.name("cs_display")).sendKeys(data[i][1]);
			Thread.sleep(1000);
			driver.findElement(By.name("cs_display")).sendKeys(data[i][2]);
			Thread.sleep(1000);
			driver.findElement(By.name("cs_equal")).click();
			
			Thread.sleep(1000);
			
			String ans = "5";
			String ans2 = data[i][3];
			
			System.out.println(ans.equals(ans2));
			
			
			String ans3 = "1";
			String ans4 = data[i][3];
			
			System.out.println(ans3.equals(ans4));
			
			
			
			
//			System.out.println("exe1");
//			WebElement a= driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]"));
//			a.click();
//			Thread.sleep(1000);
//			driver.findElement(null);
//			a.sendKeys("2");
//			System.out.println("exe2");
			
//			System.out.println(data[i][0]);
//			System.out.println(data[i][1]);
//			System.out.println(data[i][2]);
			
			
			
			  //driver.findElement(By.cssSelector("#sciOutPut")).sendKeys("2");
			  // Thread.sleep(2000);
			   //a.click();
			   //Thread.sleep(2000);
			  // a.sendKeys(data[i][0]);
			   //Thread.sleep(2000);
//			   
//			   
//			   
//			   WebElement a1 = driver.findElement(By.cssSelector("div:nth-child(1) > .sciop:nth-child(4)"));
//			   Thread.sleep(2000);
//			   a1.click();
//			   Thread.sleep(2000);
//			   a1.sendKeys(data[i][1]);
//			   Thread.sleep(2000);
//			   
//			   
//			   
//			   WebElement a2 = driver.findElement(By.cssSelector("div:nth-child(3) > .scinm:nth-child(3)"));
//			   Thread.sleep(2000);
//			   a2.click();
//			   Thread.sleep(2000);
//			   a2.sendKeys(data[i][2]);
//			   Thread.sleep(2000);
			   
			   
//			   WebElement a2 = driver.findElement(By.cssSelector("div:nth-child(1) > .sciop:nth-child(4)"));
//			   Thread.sleep(2000);
//			   a2.click();
//			   Thread.sleep(2000);
//			   a2.sendKeys(data[i][2]);
//			   Thread.sleep(2000);
			   
			   
			   
//			   WebElement a1 = driver.findElement(By.cssSelector("div:nth-child(1) > .sciop:nth-child(4)"));
//			   Thread.sleep(2000);
//			    a1.click();
//			    Thread.sleep(2000);
//			    a1.sendKeys(data[i][1]);
//			    Thread.sleep(2000);
//			    
//			    
//			    
//			    
//			    driver.findElement(By.cssSelector("div:nth-child(3) > .scinm:nth-child(3)")).click();
//			    driver.findElement(By.cssSelector(".scieq:nth-child(4)")).click();

			

			
			
			
//			
//			driver.findElement(By.id("sciOutPut")).click();
//			Thread.sleep(2000);
//		   // driver.findElement(By.cssSelector("div:nth-child(3) > .scinm:nth-child(2)")).click();
//			driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).sendKeys("2");
//			
//			 WebElement a = driver.findElement(By.id("sciOutPut"));
//			 Thread.sleep(2000);
//		     a.click();
//
//		     Thread.sleep(2000);
//		     
//		     driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).sendKeys("2");
		     //System.out.println(data[i][0]);;
		     //System.out.println(data[i][1]);;
//		     Thread.sleep(2000);
//			 a.sendKeys("2");
			
			    //driver.findElement(By.cssSelector("div:nth-child(3) > .scinm:nth-child(2)")).click();

			//driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).sendKeys("2");
//			 WebElement a = driver.findElement(By.id("sciOutPut"));
//			 a.click();
//			 a.sendKeys("2");

			
			
			
//			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).sendKeys(data[i][0]);
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")).sendKeys(data[i][1]);
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).sendKeys(data[i][1]);
//			Thread.sleep(2000);
//			driver.findElement(By.id("login-button")).click();
//			Thread.sleep(2000);
//			if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"))
//			{
//				System.out.println("Your Test HasBeen Passed...");
//			}
//			else
//			{
//				System.out.println("Your Test HasbeenFailed");
//				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				File dest=new File("D:\\img\\1.png");
//				FileUtils.copyFile(src, dest);
//				Thread.sleep(2000);
//				Assert.fail("Incorrect username or password...");
//			}
//			Thread.sleep(2000);
//			System.out.println("Bye Bye...");
//			driver.close();
		}
	
	}

}
