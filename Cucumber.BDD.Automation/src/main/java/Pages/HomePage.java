package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.base;


public class HomePage extends base{
	
	LoginPage login;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ".//a[@href=\"https://ui.cogmento.com\"]/span[text()=\"Log In\"]")
	WebElement btnlogin;
	@FindBy(xpath = ".//a[@title=\"free crm home\"]")
	WebElement txthometitle;
	
	
	public LoginPage clickOnButton(String value) throws InterruptedException
	{
		btnlogin.click();
		Thread.sleep(4000);
		return login = new LoginPage();
	}
	
	public String getHomePageTextValue(String value)
	{
		if(value.equalsIgnoreCase("Title"))
		{
		return txthometitle.getText();
		}
		else
		{
			return null;
		}
	}

}
