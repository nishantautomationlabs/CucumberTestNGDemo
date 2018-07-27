package stepdefinitions;

import Base.BaseContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseContext {

    private BaseContext baseContext;

    public Hooks(BaseContext baseContext) {
        this.baseContext = baseContext;
    }

    @Before(order = 0)
    public void setUp() {
        baseContext.data = "http://automationindepth.blogspot.com";
        System.out.println("Global setUp 1");
    }

    @After(order = 0)
    public void tearDown() {
        System.out.println("Global tearDown 1");
    }

    @After(order = 0)
    public void tearDownWithScenarioAsParameter(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("Scenario '" + scenario.getName() + "' Failed!!!");
        }
    }

    @Before(order = 1)
    public void setUp1() {
        System.out.println("Global setUp 2");
    }

    @After(order = 1)
    public void tearDown1() {
        System.out.println("Global tearDown 2");
    }

    @Before("@TagA")
    public void setUpForTagACases() {
        System.out.println("setUp for tag A cases");
    }

    @After("@TagA")
    public void tearDownForTagACases() {
        System.out.println("tearDown for tag A cases");
    }

    @Before("@TagB")
    public void setUpForTagBCases() {
        System.out.println("setUp for tag B cases");
    }

    @After("@TagB")
    public void tearDownForTagBCases() {
        System.out.println("tearDown for tag B cases");
    }
}
