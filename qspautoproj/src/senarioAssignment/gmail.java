package senarioAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		Thread.sleep(8000);
		
		
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("sheikhumer1610@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

}