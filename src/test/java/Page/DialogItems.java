package Page;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogItems extends Parent {


    public DialogItems() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Register")
    public WebElement registerBtn;

    @FindBy(id = "customer.firstName")
    public WebElement firstName;

    @FindBy(name = "payee.name")
    public WebElement payeeName;

    @FindBy(name = "payee.accountNumber")
    public WebElement payeeAccNo;

    @FindBy(name = "verifyAccount")
    public WebElement payeeAccNo2;

    @FindBy(name = "amount")
    public WebElement payeeAmount;

    @FindBy(id = "customer.lastName")
    public WebElement lastName;

    @FindBy(xpath = "//input[contains(@name,'address.street')]")
    public WebElement address;

    @FindBy(xpath = "//input[contains(@name,'address.city')]")
    public WebElement city;

    @FindBy(xpath = "//input[contains(@name,'address.state')]")
    public WebElement state;

    @FindBy(xpath = "//input[contains(@name,'address.zipCode')]")
    public WebElement zipCode;

    @FindBy(xpath = "//input[contains(@name,'phoneNumber')]")
    public WebElement phoneNumber;

    @FindBy(id = "customer.ssn")
    public WebElement ssn;

    @FindBy(id = "customer.username")
    public WebElement registerUsername;

    @FindBy(id = "customer.password")
    public WebElement registerPassword;

    @FindBy(id = "repeatedPassword")
    public WebElement confirm;

    @FindBy(xpath = "//input[@value='Register']")
    public WebElement registerSubmit;

    @FindBy(xpath = "//div[@id='rightPanel']/p")
    public WebElement registerConfirm;

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(css = "input[value='Log In']")
    public WebElement loginBtn;

    @FindBy(linkText = "Log Out")
    public WebElement logOutBtn;

    @FindBy(linkText = "Bill Pay")
    public WebElement billPayTab;

    @FindBy(css = "div[ng-show='showResult']>p")
    public WebElement billPayConfirm;

    @FindBy(css = "input[value='Send Payment']")
    public WebElement billPayBtn;

    public WebElement getWebElements(String text) {

        switch (text) {
            case "firstName":
                return firstName;
            case "lastName":
                return lastName;
            case "address":
                return address;
            case "city":
                return city;
            case "state":
                return state;
            case "zipCode":
                return zipCode;
            case "phoneNumber":
                return phoneNumber;
            case "ssn":
                return ssn;
            case "registerUsername":
                return registerUsername;
            case "registerPassword":
                return registerPassword;
            case "confirm":
                return confirm;
            case "registerSubmit":
                return registerSubmit;

            default: return null;
        }

    }






}
