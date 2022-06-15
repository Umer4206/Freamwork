package assertintestng;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class AssertionInTestNG {
  @Test
  public void testcase() {
	  
	  Reporter.log("lanuch the browser",true);
	  Reporter.log("lanuch the web app by using url",true);
	  Reporter.log("verify the login page title",true);
	  SoftAssert softAssert =new SoftAssert();
	  softAssert.assertEquals(false,true);
	  
	  Reporter.log("perform login",true);
	  Assert.assertEquals(true,true);//hard assert
	  Reporter.log("verify the home page title",true);
	  Reporter.log("create user",true);
	  Reporter.log("cerate contact",true);
	  softAssert.assertAll();
  }


}
