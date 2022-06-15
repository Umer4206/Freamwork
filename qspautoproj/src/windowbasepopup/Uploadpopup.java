package windowbasepopup;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Uploadpopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("http://desktop-rdmbkpq/login.do");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		driver.findElement(By.xpath("//a[@class='content administration']")).click();
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		driver.findElement(By.id("uploadNewLogoOption")).click();
		Thread.sleep(3000);
		 WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		 Thread.sleep(3000);
		 Actions act = new Actions(driver);
		 act.doubleClick(target).perform();
		 
		 Thread.sleep(3000);
		 File umair = new File("./auto/fu1.exe");
		 String abspath = umair.getAbsolutePath();
		 
		 
		 Runtime.getRuntime().exec(abspath);
		 Thread.sleep(3000);
		 Runtime.getRuntime().exec(abspath);
		
		
		

	}

}
