package keyworddrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeLogin1 extends BaseTest1{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest1 base = new BaseTest1();
		base.openBrowser();
		
		//login operation
		
		Flib flib = new Flib();
		String username = flib.readPropertyFile(PROP_PATH, "username");
		String password = flib.readPropertyFile(PROP_PATH, "password");

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		
		Thread.sleep(3000);
	
		base.closeBrowser();
			

	}

}
