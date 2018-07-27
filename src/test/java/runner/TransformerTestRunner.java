package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/java/features/transformerExample.feature",
        glue = "stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-html-report"},
        dryRun = false,
        strict = true
)

public class TransformerTestRunner extends AbstractTestNGCucumberTests {


}