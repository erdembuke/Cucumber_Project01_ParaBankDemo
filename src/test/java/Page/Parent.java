package Page;

import Utilities.GWD;
import dev.failsafe.internal.util.Durations;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;

public class Parent {

    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));

    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void sendKeysFunction(WebElement element, String text){
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    public void clickFunction(WebElement element){
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void verifyContainsTextFunction(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()), "No Such Text");
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();
    }

    public void  verifyElementDisplayed(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.isDisplayed());
    }







}
