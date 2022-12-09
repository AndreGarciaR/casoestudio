package co.com.xyztesters.globalsqa.stepsdefinitions;

import co.com.xyztesters.globalsqa.steps.PortalStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.cucumber.datatable.DataTable;

import java.util.Map;

public class LoginStepdefinitions {

    PortalStep stepPortal;

    @Given("You are logged in to the application")
    public void youAreLoggedInToTheApplication(DataTable dataLogin) {
       Map<String, String> data = dataLogin.asMap(String.class, String.class);
        stepPortal.LoginPortal(data.get("username"), data.get("password"));
    }

    @When("you click on the Login button")
    public void youClickOnTheLoginButton() {

    }
    @Then("you successfully login to the portal")
    public void youSuccessfullyLoginToThePortal() {

    }
/////

    @Given("that Juan wants to register with GlobalSQA")
    public void that_juan_wants_to_register_with_global_sqa() {

    }

    @When("the user enters the data required by the system")
    public void the_user_enters_the_data_required_by_the_system(DataTable dataRegister) {
        Map<String, String> data = dataRegister.asMap(String.class, String.class);
        stepPortal.RegisterPortal(data.get("firstName"), data.get("lastName"), data.get("username"),data.get("password"));
    }

    @Then("the user is successfully registered")
    public void the_user_is_successfully_registered() {

    }

}
