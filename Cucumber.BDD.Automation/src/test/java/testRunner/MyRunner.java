package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "\\Users\\Global\\eclipse-workspace\\Cucumber.BDD.Automation\\src\\test\\java\\feature\\Login.feature", //the path of the feature files
		glue={"stepDefiniations", "Hooks"}
		)
 
public class MyRunner {

}
