package EST_TimeZone;

import org.testng.annotations.Test;

public class TestNGExp8 {
  @Test(priority=4)
  public void A() {
	  System.out.println("this is Retesting");
  }
  @Test(priority=3)
  public void B() {
	  System.out.println("this is Regrassion testing");
  }
  @Test(priority=2)
  public void C() {
	  System.out.println("this is Smoke testing");
  }
  @Test(priority=5,description="this is login info")
  public void D() {
	  System.out.println("this is GUI testing");
  }
  @Test(priority=1)
  public void E() {
	  System.out.println("this is System level testing");
  }
}
