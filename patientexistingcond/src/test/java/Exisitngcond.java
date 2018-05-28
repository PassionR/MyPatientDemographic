import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Exisitngcond {
  @Test
  public void f() {
	  System.out.println("print exisitng ocndion");
  }
	 @Test
  public void f1() {
	  System.out.println("print exisitng ocndion 1");
  }
	 @Test
  public void f2() {
	  System.out.println("print exisitng ocndion 2");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
