package EST_TimeZone;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgExp4 {
  @BeforeMethod
  public void ClearMethod() {
	  System.out.println("this is test case one");
  }
  @Test
  public void Tc01()
  {
	  System.out.println("this is Login form");
  }
  @Test
  public void Tc03()
  {
	  System.out.println("this will execute AfterMethod");
  }
  @AfterMethod
  public void Tc04()
  {
	  System.out.println("this is last option");
  }
}
