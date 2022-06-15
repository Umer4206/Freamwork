import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatarcarwale {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.carwale.com/used/mylistings/search/");
		
		//login operation
		
		driver.findElement(By.id("MobSearch")).sendKeys("8308215326");//type username
		driver.findElement(By.id("submitEditSearch")).click();//click on login button
		
	}

}
