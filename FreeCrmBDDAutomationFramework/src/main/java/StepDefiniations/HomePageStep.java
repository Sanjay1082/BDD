package StepDefiniations;

import static org.testng.Assert.assertEquals;

import Base.base;
import Pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageStep extends base{
	HomePage home;
	
	public HomePageStep()
	{
		home = new HomePage();
	}

@Given("^: User is on homepage$")
public void user_is_on_homepage() throws Throwable {
    String title = home.getValueFromHomePage("Title");
    boolean titletrue = title.startsWith("YOUR BUSINESS CLOUD PARTNER");
    assertEquals(true,titletrue);
    
}

@When("^: Navigate to login page$")
public void navigate_to_login_page() throws Throwable {
    home.clickOnButtonOnHomePage("Log In");
   
}
}
