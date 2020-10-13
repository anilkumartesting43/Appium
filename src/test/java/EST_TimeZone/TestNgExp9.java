package EST_TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgExp9 {
	WebDriver driver;
  @Test(priority=1)
  public void LaunchAUT() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://login.salesforce.com/?locale=in");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }
  @Test(priority=3,description="this is Click Action")
  public void Click() throws InterruptedException
  {
	  driver.findElement(By.id("Login")).click();
	  Thread.sleep(2000);
  }
  
  @Test(priority=2,description="this is user details")
  public void SendData() throws InterruptedException
  {
	  driver.findElement(By.id("username")).sendKeys("anilkumartesting43@gmail.com");
	  Thread.sleep(2000);
	  driver.findElement(By.id("password")).sendKeys("anil1234");
	  Thread.sleep(2000);
  }
  }

