package StepDefinitions;

import Page.DialogItems;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegisterSteps {
    DialogItems di =new DialogItems();
    @Given("navigate to ParaBank")
    public void navigateToParaBank() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("register valid username and password")
    public void registerValidUsernameAndPassword(DataTable dt) {
        di.clickFunction(di.registerBtn);

        List<List<String>> items=dt.asLists(String.class);

        for (List<String> item : items) {
            WebElement element = di.getWebElements(item.get(0));
            di.sendKeysFunction(element, item.get(1));
        }

        di.clickFunction(di.registerSubmit);

    }

    @Then("user should register successfully")
    public void userShouldRegisterSuccessfully() {
        di.verifyContainsTextFunction(di.registerConfirm , "successfull");
    }
}
