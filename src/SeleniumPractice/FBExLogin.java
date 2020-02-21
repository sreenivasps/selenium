package SeleniumPractice;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class FBExLogin {
	public WebDriver driver;
  @Test(groups="Login", priority=1)
  public void Login() throws Exception {
	  FileInputStream f= new FileInputStream("E:\\Eclipse Mars\\eclipse-jee-mars-2-win32-x86_64\\Excelfiles\\Sample1.xls");
	  Workbook wb= Workbook.getWorkbook(f);
	  Sheet s = wb.getSheet("Sheet1");
	  String un=s.getCell(0,0).getContents();
	  System.out.println(un);
	  String pw=s.getCell(1,0).getContents();
	  System.out.println(pw);
	  driver.get("http://facebook.com");
	  driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pw);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
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

}
