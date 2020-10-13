package EST_TimeZone;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgExp6 {
  @BeforeClass
  public void BeforeFunction() {
	  System.out.println("this is execute at first in the class");
	  //driver.findElement(By.id("username").sendkeys(username)
  }
  @BeforeMethod
  public void FnBefore()
  {
	  System.out.println("this will execute before method");
	  
  }
  @Test
  public void PrintSome()
  {
	  System.out.println("this is tc01");
	  //we.sendkeys(admin)
	  //we1.click()
  }
  @Test
  public void PrintSomething()
  {
	  System.out.println("this is tc02");
  }
  @AfterClass
  public void AFun()
  {
	  //driver.close()
	  System.out.println("***************");
	  System.out.println("this wil execute after testcase");
  }
  @AfterMethod
  public void lastClass()
  {
	  System.out.println("*****************");
	  System.out.println("this will execute at the end of the class");
  }
  
}
