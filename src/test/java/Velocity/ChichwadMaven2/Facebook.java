package Velocity.ChichwadMaven2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Facebook 
{
  @Test
  public void f() throws InterruptedException
  
  {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening facebook",true);
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(3000);
	  driver.close();
  }
}
