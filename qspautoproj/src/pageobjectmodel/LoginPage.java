package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//declaration

	@FindBy(name="username")private WebElement usn;
	@FindBy(name="pwd")private WebElement pass;
	@FindBy(id="loginButton")private WebElement loginBtn;
	@FindBy(id="keepLoggedInCheckBox")private WebElement keepLoggedIncheckBox;
	@FindBy(xpath="//img[contains(@src,'timer'")private WebElement logo;
	@FindBy(id="licenseLink")private WebElement licenseLink;




	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	//utilization

	public WebElement getUsn() {
		return usn;
	}

	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getKeepLoggedIncheckBox() {
		return keepLoggedIncheckBox;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getLicenseLink() {
		return licenseLink;
	}



	//generic reusable method

	public void actiTimeValid(String validUsername,String validPassword)
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginBtn.click();
	}

	public void actiTimeInValid(String InvalidUsername,String InvalidPassword) throws InterruptedException
	{
		usn.sendKeys(InvalidUsername);
		pass.sendKeys(InvalidPassword);
		loginBtn.click();
		Thread.sleep(2000);
		usn.clear();
	}


	//operational methods
	
	
	
	
	
	
}