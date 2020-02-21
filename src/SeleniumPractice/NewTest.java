package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	@Test (dataProvider="getData")
  //@Parameters({"Username","Password"})
  
  public void FBlogin(String un, String pw) throws InterruptedException {
		try{
	  driver.get("http://facebook.com");
	  System.out.println("User "+un+" password "+pw);
	  driver.manage().window().maximize();
	  driver.findElement(By.id("email")).sendKeys(un);
	  driver.findElement(By.id("pass")).sendKeys(pw);
	  driver.findElement(By.id("loginbutton")).click();
	  Thread.sleep(2000);
		}catch(Exception e){
		  e.printStackTrace();
	  }
  }
  @BeforeClass
  public void OpenBrowser() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Mars\\eclipse-jee-mars-2-win32-x86_64\\dependentJars\\chromedriver.exe");
	  driver= new ChromeDriver();	
  }

  @AfterClass
  public void CloseBroswer() {
	  driver.quit();
  }
  @DataProvider(name="getData")
	public Object[][] getData(){
		Object [][] data = new Object [2][2];
		
		data [0][0] = "aparna.guttula@gmail.com";
		data [0][1] = "vijaya10";

		
		return data;
		
	}
}
