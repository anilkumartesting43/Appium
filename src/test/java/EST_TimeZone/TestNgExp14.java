package EST_TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestNgExp14 {
	 WebDriver driver;
  @Test(priority=1)
  public void headless1() 
  {
	  ChromeOptions oc = new ChromeOptions();
		oc.addArguments("--headless");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver  = new ChromeDriver(oc);
		driver.get("https://google.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("the title is:"+title);
		Actions actobj =new Actions(driver);
		WebElement we=driver.findElement(By.name("q"));
		actobj.sendKeys(we, "core java books").perform();
		actobj.sendKeys(Keys.ENTER).perform();
	 
	 
  }
  
 
}
