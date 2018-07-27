package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/java/features/cucumberJava8Example.feature",
        glue = "stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-html-report"},
        dryRun = false,
        strict = true
)

public class CucumberJava8TestRunner extends AbstractTestNGCucumberTests {


}
