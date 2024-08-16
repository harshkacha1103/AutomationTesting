package Testnextng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Gmail {
	
	private WebDriver driver;

    @BeforeTest
    public void setUp() {
        
    	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() 
    {
        return new Object[][]
        		{
           
            {"harshrextertech@gmail.com","12345678"},
       
        };
    }
    

    @Test(dataProvider = "loginData")
    public void testFacebookLogin(String email, String password) throws InterruptedException {
        driver.get("https://accounts.google.com/");

        WebElement emailField = driver.findElement(By.id("identifierId"));
        emailField.sendKeys(email);
      
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
    
    }
    
    @AfterTest
    public void tearDown() throws InterruptedException {
    	Thread.sleep(2000);
        driver.quit();
    }

}
