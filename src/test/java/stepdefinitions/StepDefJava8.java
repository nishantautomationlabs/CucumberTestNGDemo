package stepdefinitions;

import cucumber.api.java8.En;

public class StepDefJava8 implements En {

    public StepDefJava8() {

        Given("^User open the website and navigates to login page$", () -> {
            System.out.println("Open the website and navigate to Login page");
        });

        When("^User enters the email address as \"([^\"]*)\"$", (String emailAddress) -> {
            System.out.println("Enter the email address as " + emailAddress);
        });

        And("^User enters his password as \"([^\"]*)\"$", (String password) -> {
            System.out.println("Enter the password as " + password);

        });

        Then("^User should be redirected to the myaccount page$", () -> {
            System.out.println("Validate the title of the page");
        });

        And("^User should see the logout button$", () -> {
            System.out.println("Validate the logout button is displayed on the page");
        });
    }
}
