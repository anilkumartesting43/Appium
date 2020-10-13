package EST_TimeZone;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExp7 {
  @BeforeClass
  public void bfun() {
	  System.out.println("this will exicute at first in class");
  }
  @BeforeTest
  public void bTest()
  {
	  System.out.println("this will execute befor test");
	  System.out.println("*************");
  }
  @Test
  public void printSome()
  {
	  System.out.println("this is Tc01,retesting");
  }
  @Test
  public void printSome12()
  {
	System.out.println("this is Tc02,regrassion testing");  
  }
  @AfterMethod
  public void MethodA()
  {
	  System.out.println("****************");
	  System.out.println("this will execute AfterMethod");
  }
  @AfterTest
  public void Atest()
  {
	  System.out.println("this is execute afterTest");
  }
}
