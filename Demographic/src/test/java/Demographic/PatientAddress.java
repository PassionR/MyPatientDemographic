package Demographic;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class PatientAddress {
  @Test
  public void f() {
	  System.out.println("test address");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("test before address");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("test after address");

  }

}
