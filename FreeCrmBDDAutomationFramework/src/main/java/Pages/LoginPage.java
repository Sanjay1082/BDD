package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.base;

public class LoginPage extends base{
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath=".//input[@name='email']")
	WebElement txtusername;
	@FindBy(xpath=".//input[@name='password']")
	WebElement txtpassword;
	@FindBy(xpath=".//*[text()=\"Login\"]")
	WebElement btnlogin;
	
	public void populateFieldValue(String Username, String Password) {
		explicitWait(txtusername);
		txtusername.sendKeys(Username);
		txtpassword.sendKeys(Password);
	}
	
	public void clickOnLoginPage(String value)
	{
		if(value.equalsIgnoreCase("Title"))
		{
			explicitWait(btnlogin);
			btnlogin.click();
		}
		else
		{
			 
		}
	}

}
