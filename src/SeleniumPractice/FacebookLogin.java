package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	WebDriver driver; 
	public void Login() throws InterruptedException{
		driver.findElement(By.id("email")).sendKeys("aparna.guttula@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("vijaya10");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(20000);
		Alert a= driver.switchTo().alert();
		a.accept();
		
		
	}
	
	public FacebookLogin(){
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Mars\\eclipse-jee-mars-2-win32-x86_64\\dependentJars\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
	}
	public static void main(String[] args) throws InterruptedException {
		FacebookLogin F= new FacebookLogin();
		F.Login();
		
		
	}

}
