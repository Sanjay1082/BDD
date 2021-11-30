package Hooks;

import Base.base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends base{
	
	@Before
	public void LunchBrowser()
	{
		driver = InitiateDriver();
	}
	
	@After
	public void CleanUp()
	{
		driver.quit();
	}

}
