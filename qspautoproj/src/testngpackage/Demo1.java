package testngpackage;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class Demo1 {
	
	@Test
	public void a()
	{
		Reporter.log("demo class method",true);
	}
}
