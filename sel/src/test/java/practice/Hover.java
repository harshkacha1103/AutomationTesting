package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.MyConnection;

public class Hover {
	
	public static void main(String[] args) throws InterruptedException, IOException 
    {
   	
         WebDriver driver = MyConnection.getconnection("https://demoqa.com/automation-practice-form");
         
         {
             WebElement element = driver.findElement(By.id("firstName"));
             Actions builder = new Actions(driver);
             builder.moveToElement(element).clickAndHold().perform();
          }
         
         {
             WebElement element = driver.findElement(By.id("lastName"));
             Actions builder = new Actions(driver);
             builder.moveToElement(element).clickAndHold().perform();
          }
         
         {
             WebElement element = driver.findElement(By.id("userEmail"));
             Actions builder = new Actions(driver);
             builder.moveToElement(element).clickAndHold().perform();
         }

         driver.findElement(By.id("userEmail")).click();
         driver.findElement(By.cssSelector(".custom-radio:nth-child(1) > .custom-control-label")).click();
         driver.findElement(By.id("userNumber")).click();

         {
             WebElement element = driver.findElement(By.id("dateOfBirthInput"));
             Actions builder = new Actions(driver);
             builder.moveToElement(element).clickAndHold().perform();
           }

         {
             WebElement element = driver.findElement(By.cssSelector(".subjects-auto-complete__value-container"));
             Actions builder = new Actions(driver);
             builder.moveToElement(element).clickAndHold().perform();
           }

         driver.findElement(By.cssSelector(".custom-checkbox:nth-child(1) > .custom-control-label")).click();
         {
           WebElement element = driver.findElement(By.id("currentAddress"));
           Actions builder = new Actions(driver);
           builder.moveToElement(element).clickAndHold().perform();
         }

            WebElement State = driver.findElement(By.id("react-select-3-input"));
			Actions builder4 = new Actions(driver);
			builder4.click(State).sendKeys("Uttar Pradesh").sendKeys(Keys.ENTER).build().perform();

			Thread.sleep(1000); 

			WebElement City = driver.findElement(By.id("react-select-4-input"));
			Actions builder5 = new Actions(driver);
			builder5.click(City).sendKeys("Agra").sendKeys(Keys.ENTER).build().perform();
			
			Thread.sleep(1000); 
         
         
         
         
//         driver.findElement(By.cssSelector(".css-1pahdxg-control > .css-1hwfws3")).click();
//         driver.findElement(By.id("react-select-3-option-1")).click();
//         driver.findElement(By.cssSelector(".css-1pahdxg-control .css-1wa3eu0-placeholder")).click();
//         driver.findElement(By.id("react-select-4-option-1")).click();




 }
}