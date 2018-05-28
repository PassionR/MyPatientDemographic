package Demographic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class PatientHistory {
  @Test
  public void f() {
	  System.out.println("first test methid");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before methid");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after methid");
  }

}
