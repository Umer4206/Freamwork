import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorspotify {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.spotify.com/en/login");
		
		//login operation
		
		driver.findElement(By.id("login-username")).sendKeys("Admin");//type username
		driver.findElement(By.name("login-password")).sendKeys("admin123");//type password
		driver.findElement(By.id("login-password")).click();//click on login button
		

	}

}
