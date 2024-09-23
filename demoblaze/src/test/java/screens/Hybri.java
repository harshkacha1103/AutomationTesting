package screens;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

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
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hybri {
	
	@DataProvider(name="rahul")
	public static Object[][] readExcel() throws InvalidFormatException, IOException
	{
		Object[][] data=null;
			
		String filepath="D:\\test2.xlsx"; //only string form path
		
		File file=new File(filepath); //to make an file
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);//to open the excel file
		
		Sheet sheet=workbook.getSheet("Sheet1");
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		
		
		int num = sc.nextInt();
		
	    switch(num) {
	      
	    case 1:
	    	 sheet=workbook.getSheet("Sheet1");//to open the perticular sheet
			break;
			
	    case 2:
	    	 sheet=workbook.getSheet("Sheet2");
	    	break;
	    case 3:
	    	 sheet=workbook.getSheet("Sheet3");
	    	break;
	    	
	    
	    }
		
		
//		Sheet sheet1=workbook.getSheet("Sheet1");//to open the perticular sheet
//		Sheet sheet2=workbook.getSheet("Sheet2");
//		Sheet sheet3=workbook.getSheet("Sheet3");
		
		int nrows1=sheet.getPhysicalNumberOfRows();
//		int nrows2=sheet2.getPhysicalNumberOfRows();
//		int nrows3=sheet3.getPhysicalNumberOfRows();
		
		
		data=new Object[nrows1][];
		
		
		
		
		
		for(int i=0;i<nrows1;i++)//row
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

//		for(int i=0;i<nrows2;i++)
//		{
//			Row row=sheet2.getRow(i);
//			int ncols=row.getPhysicalNumberOfCells();
//			data[nrows1+i]=new Object[ncols];
//			for(int j=0;j<ncols;j++)
//			{
//				Cell cell=row.getCell(j);
//				cell.setCellType(CellType.STRING);
//				data[nrows1+i][j]=cell.getStringCellValue();
//			}
//		}
//		
//		
//		for(int i=0;i<nrows3;i++)
//		{
//			Row row=sheet3.getRow(i);
//			int ncols=row.getPhysicalNumberOfCells();
//			data[nrows1+nrows2+i]=new Object[ncols];
//			for(int j=0;j<ncols;j++)
//			{
//				Cell cell=row.getCell(j);
//				cell.setCellType(CellType.STRING);
//				data[nrows1+nrows2+i][j]=cell.getStringCellValue();
//			}
//		}
		
		
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
		
		else if(keyword.equals("click contact"))
		{
			driver.findElement(By.linkText("Contact")).click();
			Thread.sleep(2000);
		}
		
		else if(keyword.equals("enter Contact Email"))
		{
			driver.findElement(By.id("recipient-email")).sendKeys(data);
			Thread.sleep(2000);
		}
		
		
		else if(keyword.equals("enter Contact Name"))
		{
			driver.findElement(By.id("recipient-name")).sendKeys(data);
			Thread.sleep(2000);
		}
		
		
		else if(keyword.equals("enter Message"))
		{
			driver.findElement(By.id("message-text")).sendKeys(data);
			Thread.sleep(2000);
		}
		
		
		else if(keyword.equals("click send message"))
			{
					
					File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					File dest=new File("D:\\\\img\\\\11.png");
					FileUtils.copyFile(src, dest);
					Thread.sleep(2000);
			//Assert.fail("Incorrect Contact Email,Name or Message...");
				driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
				Thread.sleep(2000);
				
				
			}    
		
		
		}

	}		
				
			
			
//				if(driver.getCurrentUrl().equals("https://www.demoblaze.com1/"))
//					{
//						System.out.println("Your Test HasBeen Passed...");	
//					}
//				
//			
//				
//				else
//					{
//						System.out.println("Your Test HasbeenFailed");
//						File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//						File dest=new File("D:\\\\img\\\\11.png");
//						FileUtils.copyFile(src, dest);
//						Thread.sleep(2000);
//						Assert.fail("Incorrect Contact Email,Name or Message...");
//					}
			
	

		
//		else if(keyword.equals("enter Contact Email"))
//		{
//			driver.findElement(By.id("recipient-email")).sendKeys(data);
//			Thread.sleep(2000);
//		}
//		else if(keyword.equals("click login"))
//		{
//			driver.findElement(By.id("login-button")).click();
//			Thread.sleep(2000);
//			if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"))
//			{
//				System.out.println("Your Test HasBeen Passed...");
//			}
//			
//			else
//			{
//				System.out.println("Your Test HasbeenFailed");
//				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				File dest=new File("D:\\\\\\\\img\\\\\\\\1.png");
//				FileUtils.copyFile(src, dest);
//				Thread.sleep(2000);
//				Assert.fail("Incorrect username or password...");
//			}
//		}
//		
//		else if(keyword.equals("click sidemenu"))
//		{
//			driver.findElement(By.id("react-burger-menu-btn")).click();
//			Thread.sleep(2000);
//		}
//		else if(keyword.equals("click logout"))
//		{
//			driver.findElement(By.id("logout_sidebar_link")).click();
//			Thread.sleep(2000);
//		}
//		else if(keyword.equals("close browser"))
//		{
//			System.out.println("Bye Bye...");
//			driver.close();
//		}

