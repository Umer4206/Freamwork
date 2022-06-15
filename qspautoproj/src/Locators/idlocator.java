package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class idlocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/john/Desktop/skype/username.html");
		driver.findElement(By.id("I1")).sendKeys("admin");
		driver.findElement(By.id("I2")).sendKeys("manager");
	}

}
