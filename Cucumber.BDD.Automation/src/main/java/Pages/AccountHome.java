package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.base;

   public class AccountHome extends base{
	
	public AccountHome()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ".//*[text()=\"Sanjay Garer\"]")
	WebElement txtusername;

	public String getAccountPageTextValue(String value)
	{
		if(value.equalsIgnoreCase("Username"))
		{
		return txtusername.getText();
		}
		else
		{
			return null;
		}
	}
}
