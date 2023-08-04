package Mavenproject.practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Meesho {
  @Test
  public void meeshotesting() throws InterruptedException 
  
  {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening meesho",true);
	  driver.get("https://www.meesho.com/");
	  Thread.sleep(3000);
	  driver.close();

  }
}
