package StepDefinitions;

import Page.DialogItems;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class BillPaySteps {
    DialogItems di = new DialogItems();

    @And("user should navigate Bill Pay {string} , {string} , {string} and fill all fields correctly")
    public void userShouldNavigateBillPayAndFillAllFieldsCorrectly(String payeeName, String accNo, String amount) {
        di.clickFunction(di.billPayTab);
        di.sendKeysFunction(di.payeeName , payeeName);
        di.sendKeysFunction(di.address , "beykoz");
        di.sendKeysFunction(di.city , "istanbul");
        di.sendKeysFunction(di.state , "ist");
        di.sendKeysFunction(di.zipCode, "34800");
        di.sendKeysFunction(di.phoneNumber, "456127845");
        di.sendKeysFunction(di.payeeAccNo , accNo);
        di.sendKeysFunction(di.payeeAccNo2 , accNo);
        di.sendKeysFunction(di.payeeAmount , amount);
        di.clickFunction(di.billPayBtn);
    }

    @Then("user should pay successfully")
    public void userShouldPaySuccessfully() {
        di.verifyContainsTextFunction(di.billPayConfirm , "successful");
    }

}
