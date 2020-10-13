
package EST_TimeZone;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgExp123 {
 
	WebDriver driver;
    @Test(priority=1)
	public void headless1()
	{
		ChromeOptions oc = new ChromeOptions();
		oc.addArguments("--headless");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver  = new ChromeDriver(oc);
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println(title);
		WebElement we=driver.findElement(By.name("q"));
		we.sendKeys("i phone 11 pro"); 
		we.click();
	}
	
	
		
	}

