import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatormagicbrick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.magicbricks.com/userauth/login");
		
		//login operation
		
		driver.findElement(By.name("loginType")).sendKeys("8308215326");//type username
		driver.findElement(By.id("btnStep1")).click();//click on login button
		
	}

}
