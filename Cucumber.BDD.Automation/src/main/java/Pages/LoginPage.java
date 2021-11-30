package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.base;


public class LoginPage extends base{
	AccountHome accounthome;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ".//input[@name=\"email\"]")
	WebElement txtusername;
	@FindBy(xpath = ".//input[@name=\"password\"]")
	WebElement txtpassword;
	@FindBy(xpath = ".//*[text()=\"Login\"]")
	WebElement btnlogin1;
	
	
	public AccountHome clickOnButton(String value) throws InterruptedException
	{
		btnlogin1.click();
		Thread.sleep(4000);
		return accounthome = new AccountHome();
	}
	
	public void populateText(String username, String password) {
		txtusername.sendKeys(username);
		txtpassword.sendKeys(password);
	}

}
