package pageobjectmodel;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest1 implements Iautoconstant {

	static WebDriver driver;

	public void openBrowser() throws IOException

	{
			Flib flib = new Flib();
			String browservalue = flib.readProperyFile(PROP_PATH, "browser");
			String url = flib.readProperyFile(PROP_PATH, "url");

			if(browservalue.equalsIgnoreCase("chrome"))
			{
				System.setProperty(CHROME_KEY, CHROME_VALUE);
				driver=new ChromeDriver();
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);


			}
			else if(browservalue.equalsIgnoreCase("firefox"))
			{
				System.setProperty(GECKO_KEY, GECKO_VALUE);
				driver=new FirefoxDriver();
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

			}

			else
			{
				System.out.println("enter valid browser");
			}


		}
		public void closeBrowser()
		{
			driver.quit();
		}
}
