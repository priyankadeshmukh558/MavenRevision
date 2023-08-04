package Mavenproject.practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ebay 

{
  @Test
  public void ebaytesting() throws InterruptedException
  
  {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening ebay",true);
	  driver.get("https://www.ebay.com/");
	  Thread.sleep(3000);
	  driver.close();

  }
}
