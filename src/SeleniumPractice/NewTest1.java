package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest1 {
	WebDriver driver;

	@Test
	public void Login() {
	driver.get("http://facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("aparna.guttula@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("vijaya10");
	driver.findElement(By.id("loginbutton")).click();
	
	}

	@BeforeClass
	public void BrowserOpen() {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Eclipse Mars\\eclipse-jee-mars-2-win32-x86_64\\dependentJars\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void afterClass() {

		driver.quit();
	}

}
