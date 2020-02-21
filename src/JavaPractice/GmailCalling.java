package JavaPractice;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class GmailCalling implements GmailProgram {
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		try{
			
		
	GmailCalling gmailObj= new GmailCalling();
	gmailObj.CromeBrowserOpen();
	gmailObj.Login();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void CromeBrowserOpen(){
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Mars\\eclipse-jee-mars-2-win32-x86_64\\dependentJars\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		driver = new ChromeDriver(options);
		driver.get("http://gmail.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	}
	
	public void IEBrowserOpen(){
		System.setProperty("webdriver.ie.driver", "E:\\Eclipse Mars\\eclipse-jee-mars-2-win32-x86_64\\dependentJars\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("http://gmail.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		//driver.quit();
	
	}
	@Override
	public void BrowserOpen() {};
	@Override
	public void Login() throws InterruptedException {
		System.out.println("Enter into Login method------------------");
		driver.findElement(By.id("identifierId")).sendKeys("aparna.guttula");
		//driver.findElement(By.xpath("//*[@id='identifierNext']/div[2]")).click();
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(80000, TimeUnit.MILLISECONDS); 
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("Vijaya@10");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		}
	@Override
	public void InboxCount() {
		System.out.println("driver.findElement(By.className('J-Ke n0')).getTagName()");
		
	}
	
}
