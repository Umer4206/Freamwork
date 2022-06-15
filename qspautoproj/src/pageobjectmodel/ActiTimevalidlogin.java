package pageobjectmodel;
	

	import java.io.IOException;

	public class ActiTimevalidlogin extends BaseTest1 {


		public static void main(String[] args) throws IOException, InterruptedException {
	
			BaseTest bt=new BaseTest();
			bt.setUp();
			
			
			Flib flib = new Flib();
			String username = flib.readProperyFile(PROP_PATH, "username");
			String password = flib.readProperyFile(PROP_PATH, "password");
			
			LoginPage lp = new LoginPage(driver);
			lp.actiTimeInValid(username, password);
			
			Thread.sleep(3000);
			bt.tearDown();
			

		}

	}

	
	
