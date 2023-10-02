package StepDefinition;

import io.cucumber.java.en.*;

public class Login {

    @Given("when a user has valid credentials like {string} and {string}")
    public void when_a_user_has_valid_credentials_like_and_and(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("userbame is :"+username+" And password is :"+password);

    }

    @When("the user tries to login")
    public void the_user_tries_to_login() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("the login should be succeesful")
    public void the_login_should_be_succeesful() {
        // Write code here that turns the phrase above into concrete actions

    }



}
