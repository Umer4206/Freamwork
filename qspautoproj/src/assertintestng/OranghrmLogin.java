package assertintestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class OranghrmLogin {
	WebDriver driver;
	@BeforeTest
	public void setProperty()
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
	}
	
	
	
  @Test
  public void testcase() throws InterruptedException {
	  
	  SoftAssert softassert=new SoftAssert();
	  String actualLoginPageTitle = driver.getTitle();
	  softassert.assertEquals(actualLoginPageTitle,"OrangHRM");
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  
	  WebElement dashBoard = driver.findElement(By.xpath("//b[.=\"Dashboard\"]"));
	  boolean statusOfDashBoard = dashBoard.isDisplayed();
	  Assert.assertEquals(statusOfDashBoard, true);
	  Thread.sleep(4000);
	  
	  String actualHomePageTitle = driver.getTitle();
	softassert.assertEquals(actualHomePageTitle,"OrangeHRMHomePage");
	Reporter.log("create user",true);
	Reporter.log("create contact",true);
	softassert.assertAll();
	
	
	
	  
	  
  }
}
