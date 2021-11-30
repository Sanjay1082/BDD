package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "\\Users\\Global\\eclipse-workspace\\FreeCrmBDDAutomationFramework\\src\\test\\java\\Feature\\MyntraloginFeature.feature",
		glue={"StepDefiniations", "Hooks"}
		)
 
public class MyRunner {

}
