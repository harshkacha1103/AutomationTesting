package se;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class abc {
  public static void main(String[] args) throws InterruptedException 
  {
	  System.setProperty("webdriver.edge.driver","C:\\Driver1\\edgedriver_win64\\msedgedriver.exe");

     WebDriver driver = new EdgeDriver();
     
     driver.manage().window().maximize();
	 driver.get("https://www.tops-int.com/");
	 Thread.sleep(3000);
	 
	 //driver.quit();//browser all tab close
	 driver.close();//browser 1 tab close
}
}
