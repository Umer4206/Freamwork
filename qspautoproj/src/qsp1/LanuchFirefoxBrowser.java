package qsp1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LanuchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");//to avoid ill.statement
		FirefoxDriver driver = new FirefoxDriver();//to open the browser
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.instagram.com");//launch the web app
		Thread.sleep(10000);//provide the delay of the 10 second
		driver.close();//close the browser
		
	}

}
