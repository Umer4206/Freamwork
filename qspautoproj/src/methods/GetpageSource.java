package methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetpageSource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/john/Desktop/Selenium/text%20box.html");
		String sourcecodeTheWebpage=driver.getPageSource();
		System.out.println(sourcecodeTheWebpage);
	}

}
