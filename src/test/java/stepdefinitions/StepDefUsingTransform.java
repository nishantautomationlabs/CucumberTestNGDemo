package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import transformer.EmailTransformer;
import transformer.DOBTransformer;
import transformer.PasswordTransformer;

import java.util.Date;

public class StepDefUsingTransform {


    @When("^User enters a random email address starting with \"([^\"]*)\"$")
    public void userEntersARandomEmailAddressStartingWithRandomemail(@Transform(EmailTransformer.class) String emailAddress) {
        System.out.println("Enter the email address as " + emailAddress);
    }

    @And("^User enters the password as \"([^\"]*)\"$")
    public void userEntersThePasswordAs(String password) {
        System.out.println("Enter the password as " + password);
    }

    @And("^User enters the employeeId as (\\d+)$")
    public void userEntersTheEmployeeIdAs(@Transform(DOBTransformer.class) int empId) {
        System.out.println("Enter the password as " + empId);
    }

    @And("^User enters a random password of length (\\d+)$")
    public void userEntersARandomPasswordOfLength(@Transform(PasswordTransformer.class) String password) {
        System.out.println("Enter the password as " + password);
    }

    @And("^User enters the date of birth as \"([^\"]*)\"$")
    public void userEntersTheDateOfBirthAsAug(@Transform(DOBTransformer.class) Date dob) {
        System.out.println("Enter the DOB as " + dob.getDate() + "-" + dob.getMonth() + "-" + dob.getYear());
    }
}
