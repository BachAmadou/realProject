package StepDefinition20;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features="src/test/java/FeatureFiles/",
	glue= {"StepDefinition20"},
	tags="@sanity",
	dryRun=false,
	monochrome=true, // to make the console more readable
	
	// Get a report
	plugin = {"pretty","html:target/HTMLReports/index.html"}
		
		)


public class TestRunner {

}
