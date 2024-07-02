package Form.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDemo {
  public static void main(String[] args) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver-win64\\chromedriver.exe");
	  
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(3000);
	 
	 //driver.quit();//browser all tab close
	 driver.close();//browser 1 tab close
	
}
}
