package stepDefiniations;

import org.openqa.selenium.WebDriver;
import Pages.HomePage;
import Pages.LoginPage;
import base.base;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeStep extends base{
	
	HomePage home;
	
	
	public HomeStep()
	{
		home = new HomePage();
	}
	
	@Given("^: User at login page$")
	public void user_at_login_page() throws Throwable {
		String title = home.getHomePageTextValue("title");
	   
	}
	
	@When("^: User navigate to loginpage$")
	public void user_navigate_to_loginpage() throws Throwable {
	   home.clickOnButton("Login");
	}

}
