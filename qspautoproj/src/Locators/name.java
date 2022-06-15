package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class name {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//login operation
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");//type username
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");//type password
		driver.findElement(By.id("btnLogin")).click();//click on login button
		

	}

}
