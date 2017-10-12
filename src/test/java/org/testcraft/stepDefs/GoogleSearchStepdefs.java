package org.testcraft.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class GoogleSearchStepdefs {

    public WebDriver driver;

    public GoogleSearchStepdefs() {
        driver = Hooks.driver;
    }

    @Given("^I'm on google\\.co\\.uk main page$")
    public void openGoogleMainPage() {
        driver.get("http://www.google.co.uk");
    }

}
