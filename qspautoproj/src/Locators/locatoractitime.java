package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatoractitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://timetracker.ctepl.com/actitime/login.do");
		
		//login operation
		
		driver.findElement(By.name("username")).sendKeys("Admin");//type username
		driver.findElement(By.name("pwd")).sendKeys("admin123");//type password
		driver.findElement(By.id("loginButton")).click();//click on login button
		
	}

}
