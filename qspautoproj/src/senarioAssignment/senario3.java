package senarioAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class senario3 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/webpage");
		Thread.sleep(4000);
		
		WebElement src = driver.findElement(By.xpath("//div[@class'ui-widget-content ui-draggable ui-draggable-handle']"));
		Thread.sleep(4000);
		
		WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(4000);
		
		Actions act =new Actions(driver);
		act.dragAndDrop(src,dest).perform();
}

}
