package EST_TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgExp13 {
	WebDriver driver;
	JavascriptExecutor jse;
  @Test(priority=1)
  public void LaunchAUT() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://login.salesforce.com/?locale=in");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }
  @Test(priority=2)
  public void SendData() throws InterruptedException
  {
	  jse=(JavascriptExecutor)driver;
	  WebElement we1=driver.findElement(By.name("username"));
	  jse.executeScript("arguments[0].value='anilkumartesting43@gmail.com';",we1);
	  Thread.sleep(2000);
	  WebElement we2=driver.findElement(By.name("pw"));
	  jse.executeScript("arguments[0].value='Anil12345@';",we2);
	  Thread.sleep(2000);
  }
  @Test(priority=3)
  public void HeightLight() throws InterruptedException
  {
	  WebElement we3=driver.findElement(By.name("pw"));  
	  jse=(JavascriptExecutor)driver;
	  jse.executeScript("arguments[0].style='border:5px dotted blue';",we3);
	  Thread.sleep(2000);
  }
  @Test(priority=4,enabled=false)
  public void CloseAUT()
  {
	  driver.close();
  }
  
}
