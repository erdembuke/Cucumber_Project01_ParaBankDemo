package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void afterClass(){

        GWD.quitDriver();
    }
}
