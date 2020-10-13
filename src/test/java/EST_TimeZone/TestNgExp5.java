package EST_TimeZone;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class TestNgExp5 {
	@BeforeClass
	  public void BeforeF() {
		  System.out.println("this will execute first in class");
		  System.out.println("**********");
	  }
	  @Test
	  public void PrintSomething()
	  {
		  System.out.println("this is Tc01");
	  }
	  @Test
	  public void SayHello()
	  {
		  System.out.println("Hello");
	  }
	  @AfterClass
	  public void AfterF()
	  {
		  System.out.println("this is last option");
	  }
	}
