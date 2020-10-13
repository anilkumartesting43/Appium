package EST_TimeZone;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TestNgExp11 {
	WebDriver driver;
	Actions actobj;
  @Test(priority=1)
  public void LaunchAUT() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  Actions actobj=new Actions(driver);
	  actobj.sendKeys(Keys.ESCAPE).perform();
	  Thread.sleep(2000);
  }
  @Test(priority=2)
  public void HpopBox()
  {
	  Actions actobj=new Actions(driver);
  WebElement we1=driver.findElement(By.name("q"));
  actobj.sendKeys(we1, "I phone 11 pro").perform();
  actobj.sendKeys(Keys.ENTER).perform();
  }
  @Test(priority=3)
  public void TsShot() throws IOException
  {
	  File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File dest= new File("C:\\Users\\ANIL CH\\Desktop\\Manual.jpg");
	  FileHandler.copy(src, dest);
  }
  
}
