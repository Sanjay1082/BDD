package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.base;

public class HomePage extends base{
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath=".//*[@title=\"free crm home\"]")
	WebElement txttitle;
	@FindBy(xpath=".//*[text()=\"Log In\"]")
	WebElement btnlogin;
	
	
	public String getValueFromHomePage(String value)
	{
		if(value.equalsIgnoreCase("Title"))
		{
			return txttitle.getText();
		}
		else
		{
			return null;
		}
	}
	
	public void clickOnButtonOnHomePage(String value)
	{
		if(value.equalsIgnoreCase("Log In"))
		{
			btnlogin.click();
		}
		else
		{
			 
		}
	}
	
}
