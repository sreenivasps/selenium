package SeleniumPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	
	@Test
	@Parameters({"browser","Login"})
	public void parameterizedTest(String browser, String Login){
		if(browser.equals("firefox")){
			System.out.println("Open Firefox Driver");
			System.out.println("Sample"+Login);
		}else if(browser.equals("chrome")){
			System.out.println("Open Chrome Driver");
		}
	}	
}