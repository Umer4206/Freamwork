package ReadDataFromExcel;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalid {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-rdmbkpq/login.do");

		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		Flib flib = new Flib();
		int rc = flib.getrowCount("./data/ActiTimeTestData.xls","invalidcred");


		for(int i=0;i<=rc;i++)
		{
			String username = flib.readExcelData("./data/ActiTimeTestData.xls","invalidcred", i, 0);
			String password = flib.readExcelData("./data/ActiTimeTestData.xls","invalidcred", i, 1);

			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
		

			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		}

	}

}
