package stepdefinitions;

import Base.BaseContext;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import model.User;

import java.util.List;
import java.util.Map;


public class StepDefinitions extends BaseContext {

    private BaseContext baseContext;

    public StepDefinitions(BaseContext baseContext) {
        this.baseContext = baseContext;
    }

    @Given("^User open the website and navigate to login page$")
    public void userOpenTheWebsiteAndNavigateToLoginPage() {
        System.out.println("The website is " + baseContext.data);
        System.out.println("Open the website and navigate to Login page");
    }

    @When("^User enters valid username and password$")
    public void userEntersValidUsernameAndPassword() {
        System.out.println("Enter the username as HardCodedUserName and password as HardCodedPassword");

    }

    @When("^User enters valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userEntersValidUsernameAndPassword(String username, String password) {
        System.out.println("Enter the username as " + username + " and password as " + password + " using the parameter values");
    }

    @When("^User enters valid username and password passed as data table$")
    public void userEntersValidUsernameAndPasswordPassedAsDataTable(DataTable credentials) {
        List<List<String>> data = credentials.raw();
        System.out.println("Enter the username as " + data.get(0).get(0) + " and password as " + data.get(0).get(1) + " using List of List of String");
    }

    @When("^User enters valid username and password passed as data table using List$")
    public void userEntersValidUsernameAndPasswordPassedAsDataTableUsingList(List<User> users) {
        for (User user : users) {
            System.out.println("Enter the username as " + user.username + " and password as " + user.password + " using List of Object");
        }
    }

    @When("^User enters valid username and password passed as data table using map$")
    public void userEntersValidUsernameAndPasswordPassedAsDataTableUsingMap(DataTable credentials) {
        List<Map<String, String>> dataMap = credentials.asMaps(String.class, String.class);
        for (Map<String, String> map : dataMap) {
            System.out.println("Enter the username as " + map.get("username") + "and password as " + map.get("password") + " using map");
        }
    }

    @When("^User enters valid username as \"([^\"]*)\" and password as \"([^\"]*)\" using examples$")
    public void userEntersValidUsernameAsAndPasswordAsUsingExamples(String username, String password) {
        System.out.println("Enter the username as " + username + " and password as " + password + " passed using examples");
    }

    @Then("^User should be redirected to myaccount page$")
    public void userShouldBeRedirectedToMyAccountPage() {
        System.out.println("Validate the title of the page");
    }

    @And("^User should see logout button$")
    public void userShouldSeeLogoutButton() {
        System.out.println("Validate the logout button is displayed on the page");
    }

    @But("^User should not see login button$")
    public void userShouldNotSeeLoginButton() {
        System.out.println("Validate the login button is not displayed on the page");
    }
}
