package JavaPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailInbox {
	WebDriver driver;
	public void Login(){
		driver.findElement(By.id("identifierId")).sendKeys("aparna.guttula");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);      
		 driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);  
		 driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("Vijaya@10");
		 driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Mars\\eclipse-jee-mars-2-win32-x86_64\\eclipse\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		GmailInbox g= new GmailInbox();
		g.Login();
	}

	}


