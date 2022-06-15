package keyworddrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidActiTimeLoginTest extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.openBrowser();

		Flib flib = new Flib();

		int rc = flib.getrowCount("./data/ActiTimeTestData.xls", "invalidcred");
		
		for(int i=0;i<=rc;i++)
		{

			String username = flib.readExcelData("./data/ActiTimeTestData.xls", "invalidcred", i, 0);
			String password = flib.readExcelData("./data/ActiTimeTestData.xls", "invalidcred", i, 1);

			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(5000);


			driver.findElement(By.name("username")).clear();

		}
		bt.closeBrowser();

	}





}
