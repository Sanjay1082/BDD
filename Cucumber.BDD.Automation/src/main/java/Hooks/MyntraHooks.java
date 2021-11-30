package Hooks;

import base.base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class MyntraHooks extends base{
	
	
	@Before
	public void LaunchBrowser()
	{
		driver = initiationOfDriver();	
	}
	
	@After
	public void CleanUp() {
		driver.quit();
	}

}
