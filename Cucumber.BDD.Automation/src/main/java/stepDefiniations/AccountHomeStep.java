package stepDefiniations;

import static org.testng.Assert.assertEquals;
import Pages.AccountHome;
import base.base;
import cucumber.api.java.en.Then;




public class AccountHomeStep extends base{
	AccountHome accounthome;
	
	public AccountHomeStep()
	{
		accounthome=new AccountHome();
	}
	
	@Then("^User should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
	 
		String Username=accounthome.getAccountPageTextValue("Username");
	
		assertEquals("Sanjay Garer",Username);
		
	}
	
}
