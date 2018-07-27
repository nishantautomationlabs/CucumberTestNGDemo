package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/java/features/scenarioOutlineExample.feature",
        glue = "stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-html-report"},
        dryRun = false,
        strict = true
)

public class ScenarioOutlineTestRunner extends AbstractTestNGCucumberTests {


}