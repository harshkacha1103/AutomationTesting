package practice;



import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import util.MyConnection;



public class StudentRegistration {
	
	public static void main(String[] args) throws InterruptedException, IOException 
    {
   	
         WebDriver driver = MyConnection.getconnection("https://www.google.com/");
		
		WebElement search  = driver.findElement(By.name("q"));
		Actions builder = new Actions(driver);
		
		builder.click(search)
		.keyDown(Keys.SHIFT)
		.sendKeys("demoqa practice form")
		.keyUp(Keys.SHIFT)
		.sendKeys(Keys.ENTER)
		.build()
		.perform();
		
		Thread.sleep(1000);
		
		WebElement search1  = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/span/a/h3"));
		Actions builder1 = new Actions(driver);
		
		builder1.click(search1)
		.keyDown(Keys.SHIFT)
		.sendKeys("demoqa practice form")
		.keyUp(Keys.SHIFT)
		.sendKeys(Keys.ENTER)
		.build()
	   .perform();
		
		Thread.sleep(2000);
		
		
		
		{
            WebElement element = driver.findElement(By.id("firstName"));
            Actions builder3 = new Actions(driver);
            builder3.moveToElement(element).clickAndHold().perform();
         }
        
        {
            WebElement element = driver.findElement(By.id("lastName"));
            Actions builder4 = new Actions(driver);
            builder4.moveToElement(element).clickAndHold().perform();
         }
        
        {
            WebElement element = driver.findElement(By.id("userEmail"));
            Actions builder5 = new Actions(driver);
            builder5.moveToElement(element).clickAndHold().perform();
        }

        driver.findElement(By.id("userEmail")).click();
        driver.findElement(By.cssSelector(".custom-radio:nth-child(1) > .custom-control-label")).click();
        driver.findElement(By.id("userNumber")).click();

        {
            WebElement element = driver.findElement(By.id("dateOfBirthInput"));
            Actions builder6 = new Actions(driver);
            builder6.moveToElement(element).clickAndHold().perform();
          }

        {
            WebElement element = driver.findElement(By.cssSelector(".subjects-auto-complete__value-container"));
            Actions builder7 = new Actions(driver);
            builder7.moveToElement(element).clickAndHold().perform();
          }

        driver.findElement(By.cssSelector(".custom-checkbox:nth-child(1) > .custom-control-label")).click();
        {
          WebElement element = driver.findElement(By.id("currentAddress"));
          Actions builder8 = new Actions(driver);
          builder8.moveToElement(element).clickAndHold().perform();
        }

           WebElement State = driver.findElement(By.id("react-select-3-input"));
			Actions builder9 = new Actions(driver);
			builder9.click(State).sendKeys("Uttar Pradesh").sendKeys(Keys.ENTER).build().perform();

			Thread.sleep(1000); 

			WebElement City = driver.findElement(By.id("react-select-4-input"));
			Actions builder10 = new Actions(driver);
			builder10.click(City).sendKeys("Agra").sendKeys(Keys.ENTER).build().perform();
			
			Thread.sleep(1000); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 WebElement fname = driver.findElement(By.id("firstName"));
		fname.sendKeys("Harsh");
		
		Thread.sleep(1000);
		
		WebElement lname = driver.findElement(By.id("lastName"));
		lname.sendKeys("Kacha");
		
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("d@gmail.com");
	
		Thread.sleep(1000);
		
		WebElement gender = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]"));
		gender.click();
		
		Thread.sleep(1000);
		
		WebElement mob = driver.findElement(By.id("userNumber"));
		mob.sendKeys("998899889");
		Thread.sleep(1000);
		
		String day = "11";
		String month = "April";
		String year = "2003";
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		WebElement mymonth = driver.findElement(By.className("react-datepicker__month-select"));
		Select m = new Select(mymonth);
		m.selectByVisibleText(month);
		
		Thread.sleep(1000);
		
		WebElement myyear = driver.findElement(By.className("react-datepicker__year-select"));
		Select y = new Select(myyear);
		y.selectByVisibleText(year);
		
		Thread.sleep(1000);
		List<WebElement> days = driver.findElements(By.xpath("//*[@class='react-datepicker__week']/div"));
		
		for(WebElement d : days)
		{
			if(d.getText().equals(day))
			{
				if(d.getAttribute("aria-label").contains(month))
				{
					d.click();
					break;
				}
				
			}
		}
		
		Thread.sleep(1000);
		
		WebElement hobby = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
		hobby.click();
		
		Thread.sleep(1000);
		
		WebElement hobby1 = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label"));
		hobby1.click();
		
		Thread.sleep(1000);
		
		WebElement hobby2 = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label"));
		hobby2.click();
		
		Thread.sleep(1000);

		
		driver.findElement(By.id("uploadPicture")).sendKeys("D:\\Car.jpg");
		Thread.sleep(1000);

		
		WebElement subject = driver.findElement(By.id("subjectsContainer"));
		Actions builder11 = new Actions(driver);
		builder11.click(subject).sendKeys("Maths").sendKeys(Keys.ENTER).sendKeys("Physics").sendKeys(Keys.ENTER).build().perform();
	
		Thread.sleep(1000);
		

		WebElement addr = driver.findElement(By.id("currentAddress"));
		addr.sendKeys("Rajkot");
		
		Thread.sleep(1000);
		
		   WebElement State1 = driver.findElement(By.id("react-select-3-input"));
			Actions builder12 = new Actions(driver);
			builder12.click(State1).sendKeys("Uttar Pradesh").sendKeys(Keys.ENTER).build().perform();

			Thread.sleep(1000); 

			WebElement City1 = driver.findElement(By.id("react-select-4-input"));
			Actions builder13 = new Actions(driver);
			builder13.click(City1).sendKeys("Agra").sendKeys(Keys.ENTER).build().perform();
			
			Thread.sleep(1000); 
	
			
			WebElement btnclick = driver.findElement(By.id("submit"));
			btnclick.click();
			Thread.sleep(1000);
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("D:\\\\img\\\\practice.png");
			FileUtils.copyFile(src, dest);
			Thread.sleep(2000);


}

}
