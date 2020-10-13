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

public class TestNgExp12 {
	WebDriver driver;
  @Test(priority=1, description="this is LaunchMethod")
  public void LaunchAUT() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  Actions actobj=new Actions(driver);
	  actobj.sendKeys(Keys.ESCAPE).perform();
	  Thread.sleep(2000); 
  }
  @Test(priority=2, description="this is Search verification")
  public void Senddata()
  {
	  Actions actobj=new Actions(driver);
	WebElement we=driver.findElement(By.name("q")); 
	actobj.sendKeys(we,"I phone 11 pro").perform();
	actobj.sendKeys(Keys.ENTER).perform();
	
  }
  @Test(priority=3, description="this is Take a ScreenShot")
  public void TSshot() throws IOException
  {
	  File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  File dest=new File("C:\\Users\\ANIL CH\\Desktop\\Manual\\flipkart.jpg");
	  FileHandler.copy(src, dest);
  }
  @Test(priority=4,enabled=false)
  public void CloseAUT()
  {
	  driver.close();
  }
  
}
