package StepDefinitions;


import Page.DialogItems;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    DialogItems di = new DialogItems();

    @When("enter valid username {string} and password {string}")
    public void enterValidUsernameAndPassword(String username, String password) {
        di.sendKeysFunction(di.username , username);
        di.sendKeysFunction(di.password , password);
        di.clickFunction(di.loginBtn);
    }

    @And("user should login successfully")
    public void userShouldLoginSuccessfully() {
        di.verifyElementDisplayed(di.logOutBtn);
    }

    @Then("user should be logout")
    public void userShouldBeLogout() {
        di.clickFunction(di.logOutBtn);
        di.verifyElementDisplayed(di.username);
    }


    @When("enter invalid username {string} and password {string}")
    public void enterInvalidUsernameAndPassword(String username, String password) {
        di.sendKeysFunction(di.username , username);
        di.sendKeysFunction(di.password , password);
        di.clickFunction(di.loginBtn);
    }

    @Then("error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        di.verifyContainsTextFunction(di.registerConfirm , "could not");
    }
}
