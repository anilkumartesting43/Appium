package EST_TimeZone;

import org.testng.annotations.Test;

public class TestNGExp3 {
  @Test(priority=4)
  public void f() {
	  System.out.println("hai pawan");
  }
  @Test(priority=2)
  public void d()
  {
	  System.out.println("hai Shwtha");
  }
  @Test(priority=1)
  public void k()
  {
	  System.out.println("hi Manisha");
  }
  @Test(priority=3)
  public void s()
  {
	  System.out.println("hai Anil");
  }
}
