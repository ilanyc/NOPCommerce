package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
    features = {"src/test/resources/login.feature"},
    glue = { "stepDefinietion", "myhook"},
    plugin = {"pretty"})


	public class NopTestRunner extends AbstractTestNGCucumberTests {
	
	

}
