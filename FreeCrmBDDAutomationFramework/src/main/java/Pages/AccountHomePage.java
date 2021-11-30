package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.base;

public class AccountHomePage extends base{
	
	public AccountHomePage()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath=".//*[text()=\"Sanjay Garer\"]")
	WebElement txtusername;
	
	public String getValueFromAccountHomePage(String value) {
		if(value.equalsIgnoreCase("Title"))
		{
			explicitWait(txtusername);
			return txtusername.getText();
		}
		else
		{
			return null;
		}
	}

}
