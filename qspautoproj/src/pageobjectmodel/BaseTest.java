package pageobjectmodel;

import java.awt.Window;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	static WebDriver driver;

	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		String browserervalue = flib.readProperyFile("./data/config.properties", "browser");
		String url = flib.readProperyFile("./data/config.properties", "url");

		if (browserervalue.equalsIgnoreCase("chrome"))

		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver= new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);


		}

		else if (browserervalue.equalsIgnoreCase("firefox"))

		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver= new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);


		}
		else
		{
			System.out.println("enter valid browser");
		}


	}

	public void tearDown()
	{
		driver.quit();
	}


}
