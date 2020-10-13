package EST_TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestNgExp16 {
	WebDriver driver;
	JavascriptExecutor jse;
	Actions actobj;
  @Test(priority=1)
  public void LaunchAUT() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://login.salesforce.com/?locale=in");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }
  @Test(priority=2)
  public void SendData() throws InterruptedException
  {
	  Actions actobj=new Actions(driver);
	  WebElement we=driver.findElement(By.name("username"));
	  actobj.sendKeys(we, "anilkumartesting43@gmail.com").perform();
	  Thread.sleep(2000);
	  
  }
  @Test(priority=3)
  public void Helight() throws InterruptedException
  {
	  jse=(JavascriptExecutor)driver;
	  WebElement we2=driver.findElement(By.name("pw"));
	  jse.executeScript("arguments[0].value='Anil12345';", we2);
	  Thread.sleep(2000);
	  jse.executeScript("arguments[0].style='border:6px solid black';", we2);
	  Thread.sleep(2000);
  }
  @Test(priority=4)
  public void Scroll() throws InterruptedException
  {
	  jse=(JavascriptExecutor)driver;
	  jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  Thread.sleep(2000);
	  jse.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	  Thread.sleep(2000);
  }
  @Test(priority=5)
  public void Navigater() throws InterruptedException
  {
	  driver.navigate().to("https://www.google.com/");
	  driver.navigate().refresh();
	  driver.navigate().back();
	  driver.navigate().forward();
	  Thread.sleep(2000);
  }
  @Test(priority=6,enabled=false)
  public void closeAUT()
  {
	  driver.quit();
  }
  
}
