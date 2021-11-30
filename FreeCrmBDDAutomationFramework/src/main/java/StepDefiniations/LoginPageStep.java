package StepDefiniations;

import org.openqa.selenium.support.PageFactory;

import Base.base;
import Pages.LoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep extends base{ 
	LoginPage login;
	
	public LoginPageStep(){
		login =new LoginPage();
	}
	
	@When("^: User provide username and password$")
	public void user_provide_username_and_password() throws Throwable {
	    
	    login.populateFieldValue("sanjay.ece2010@gmail.com", "S@njay_1082");
	}

	@When("^: User click on login button$")
	public void user_click_on_login_button() throws Throwable {
	   login.clickOnLoginPage("login");
	}
}
