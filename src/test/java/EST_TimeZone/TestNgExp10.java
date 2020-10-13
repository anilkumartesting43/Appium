package EST_TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgExp10 {
	WebDriver driver;
  @BeforeClass
  public void LaunchAUT() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }
  @Test(priority=1,description="this is search box")
  public void SendData() throws InterruptedException
  {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("selenium books");
	  Thread.sleep(2000);
  }
  @Test(priority=2)
  public void Click() throws InterruptedException
  {
	driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
	Thread.sleep(2000);
  }
  @Test(priority=3)
  public void CloseAUT()
  {
	  driver.close();
  }
}
