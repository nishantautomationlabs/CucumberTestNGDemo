package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/java/features/CucumberScenarioExample.feature",
        glue = "stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-html-report"},
        dryRun = false,
        strict = true,
        monochrome = false,
//        tags = {"@TagA"}  //Run only cases with TagA
//        tags = {"~@TagA"} //Run cases which does not have TagA
        tags = {"@TagA, @TagB"}  //OR - Run cases with either TagA or TagB
//        tags = {"@TagA", "@TagB"}  //And - Run cases with both TagA and TagB
)

public class CucumberScenariosTestRunner extends AbstractTestNGCucumberTests {


}



