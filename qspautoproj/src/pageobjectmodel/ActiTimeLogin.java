package pageobjectmodel;

import java.io.IOException;

public class ActiTimeLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		BaseTest bt=new BaseTest();
		bt.setUp();
		
		
		Flib flib = new Flib();
		String username = flib.readProperyFile("./data/config.properties", "username");
		String password = flib.readProperyFile("./data/config.properties", "password");
		
		LoginPage lp = new LoginPage(driver);
		lp.actiTimeInValid(username, password);
		
		Thread.sleep(3000);
		bt.tearDown();
		

	}

}
