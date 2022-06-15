package senarioAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class senario13 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		Thread.sleep(4000);
		WebElement targetToMousehover=driver.findElement(By.xpath("//span[.='Offers ']"));
        
		Actions act = new Actions(driver);
		act.moveToElement(targetToMousehover).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Additional 50% Off on your 1st Installment on GMS']")).click();
		driver.close();
		
	}
}
