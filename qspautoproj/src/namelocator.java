import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class namelocator {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/accounts/login/?hl=en");
			
			//login operation
			
			driver.findElement(By.name("username")).sendKeys("sheikhumer1619@gmail.com");//type username
			driver.findElement(By.name("password")).sendKeys("asdffghjjk7");//type password
			driver.findElement(By.cssSelector("button[class*='L3NKy']")).click();


	}

}
