package senarioAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class senario17 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		Thread.sleep(4000);
		
		WebElement targetToMouseHover = driver.findElement(By.xpath("//a[@title='Coins']"));
		
		Actions act = new Actions(driver);

		act.moveToElement(targetToMouseHover).perform();
		
		Thread.sleep(3000);
		
		 driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-50gms,m']")).click();
		 
		 driver.close();
	        
	        
	        

}
}