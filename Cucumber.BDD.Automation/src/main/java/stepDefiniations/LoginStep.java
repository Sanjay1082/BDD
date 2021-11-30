package stepDefiniations;

import Pages.LoginPage;
import base.base;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class LoginStep extends base{
	
	LoginPage login;
	
	public LoginStep()
	{
		login = new LoginPage();
	}
	
	@When("^: User provide the login information as below$")
	public void user_provide_the_login_information_as_below(DataTable arg1) throws Throwable {
	   
		login.populateText("sanjay.ece2010@gmail.com", "S@njay_1082");
		
	}
	

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		login.clickOnButton("login");
	   
	}	

}
