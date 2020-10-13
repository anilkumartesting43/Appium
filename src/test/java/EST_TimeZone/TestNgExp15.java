package EST_TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgExp15 {
	WebDriver driver;
  @Test(priority=1)
  public void launchAUT() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }
  @Test(priority=2)
  public void Inputdata()
  {
	  driver.switchTo().frame("iframeResult");
	  WebElement we=driver.findElement(By.xpath("//input[@id='fname']"));
	  //verify the element is enabled or not
	  if(we.isEnabled())
	  {
		  we.clear();
		  we.sendKeys("Anil");
	  }
	  else
	  {
		  System.out.println("Element is disabled! cannot enter data");
		  
	  }
	  WebElement we1=driver.findElement(By.xpath("//input[@id='lname']"));
	  //validate  last name feild is enabled or not
	  if(we1.isEnabled())
	  {
		  we1.clear();
		  we1.sendKeys("New York");
	  }
	  
	  else
	  {
		  System.out.println("Element is disabled! cannot enter data");
	  }
	  
  }

  @Test(priority=3,enabled=false)
  public void CloseAUT()
  {
	 driver.close(); 
  }
}
