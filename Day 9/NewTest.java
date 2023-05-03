package test1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class NewTest {
  @Test(dataProvider = "dp")
  public void add(int num1,int num2,int expected) {
//	  System.err.println(num1+num2);
//	  System.out.println(result);
	  int actual=num1+num2; 
	  Assert.assertEquals(expected, actual);
  }
  
  @Test(dataProvider="dp")
  public void sub(int num1,int num2,int expected) {
	  int actual=num1-num2;
	  Assert.assertEquals(expected, actual);
  }
  @Test(dataProvider="dp")
  public void mul(int num1,int num2,int expected) {
	  int actual=num1*num2;
	  Assert.assertEquals(expected, actual);
  }
  @Test(dataProvider="dp")
  public void div(int num1,int num2,int expected) {
	  int actual=num1/num2;
	  Assert.assertEquals(expected, actual);
  }
  @DataProvider(name="dp")
  public Object[][] dp(){
	  return new Object[][] {
		  new Object[] {2,2,4},
		  new Object[] {2,3,5},
		  new Object[] {4,2,2}
	  };
  }
  
  
  
}
