package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue= {"org.stepdefinition"},plugin= {"json:target/cucumber/report.js"})
public class CucumberTest {

	
	
	
	
	
}
