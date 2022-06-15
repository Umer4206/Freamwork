package keyworddrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeInvalidLogin1 extends BaseTest1 {

	public static void main(String[] args) throws IOException, InterruptedException {


		BaseTest1 base = new BaseTest1();
		base.openBrowser();

		Flib flib = new Flib();
		String browservalue = flib.readPropertyFile(PROP_PATH, "browser");
		String url = flib.readPropertyFile(PROP_PATH, "url");

		int rc = flib.getrowCount(EXCEL_PATH, "invalidcred");

		for(int i=0;i<=rc;i++)
		{
			String username = flib.readExcelData(EXCEL_PATH, "invalidcred", i, 0);
			String password = flib.readExcelData(EXCEL_PATH, "invalidcred", i, 1);

			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();

			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		}

	    base.closeBrowser();
	}


}
