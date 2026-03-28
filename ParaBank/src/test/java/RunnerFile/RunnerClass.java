package RunnerFile;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
    features = "src/test/java/FeatureFiles",  // 👈 correct path
    glue = "StepDefinitions",                  // 👈 your step defs package
    stepNotifications = true,
    dryRun = true,
    plugin = {"pretty","html:target/cucumberreport.html", // get html report
    		 "json:target/cucumberjson.json",             // get json report
    		  "json:target/cucumberxml.xml"               // get xml report
    		 }
   // tags = "@Regression" // we can also do: "@Regression or @Sanity" if we want to run both at the same time
)
public class RunnerClass {
}