package StepDefiniations;

import Pages.AccountHomePage;
import cucumber.api.java.en.Then;

public class AccountHomePageStep {
	AccountHomePage accounthome;
	
	public AccountHomePageStep() {
		accounthome = new AccountHomePage();
	}
	
	@Then("^: User should be on AccountHomePage$")
	public void user_should_be_on_AccountHomePage() throws Throwable {
	   
		accounthome.getValueFromAccountHomePage("Title");
	}

}
