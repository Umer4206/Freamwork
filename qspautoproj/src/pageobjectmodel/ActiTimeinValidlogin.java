package pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeinValidlogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bs = new BaseTest();
		bs.setUp();

		Flib fb=new Flib();

		LoginPage login = new LoginPage(driver);

		int rc =fb.getRowCount("./data/ActiTimeTestData.xls", "invalidcred");

		for(int i=0;i<=rc;i++)
		{

			String username = fb.readExcelData("./data/ActiTimeTestData.xls", "invalidcred", i, 0);
			String password = fb.readExcelData("./data/ActiTimeTestData.xls", "invalidcred", i, 1);

			login.actiTimeInValid(username, password);
		}
		bs.tearDown();

	}

}


