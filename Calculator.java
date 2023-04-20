package Practice;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Calculator {
  @Test(dataProvider = "dp",priority = 1)
  public void add(Integer n, Integer m,Integer p) {
	  System.out.println("sum : "+(n+m+p));
  }
  @Test(dataProvider = "dp",priority = 2)
  public void sub(Integer n, Integer m,Integer p) {
	  System.out.println("difference : "+(n-m-p));
  }
  @Test(dataProvider = "dp",priority = 3)
  public void mul(Integer n, Integer m,Integer p) {
	  System.out.println("product : "+(n*m*p));
  }
  @Test(dataProvider = "dp",priority = 4)
  public void div(Integer n, Integer m ,Integer p) {
	  System.out.println("division : "+(n/m/p));
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 10, 5 ,2},
      new Object[] { 12, 3 , 4}
    };
  }
}
