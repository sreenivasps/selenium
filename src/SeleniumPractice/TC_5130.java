package SeleniumPractice;

import org.testng.annotations.Test;

public class TC_5130 {
  @Test(groups="Regression", priority=1)
  public void meth1() {
	  System.out.println("This is method 1 test case 5130");
  }
  @Test(groups="Sanity", priority=1)
  public void meth2(){
	  System.out.println("This is method 2 test case 5130");
  }
  @Test(groups="Regression",priority=2)
  public void meth3(){
	  System.out.println("This is method 3 test case 5130");
  }
  @Test(groups="Sanity", priority=2)
  public void meth4(){
	  System.out.println("This is method 4 test case 5130");
  }
}
