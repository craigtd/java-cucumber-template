package org.testcraft.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class GoogleSearchStepdefs {

    public WebDriver driver;

    public GoogleSearchStepdefs() {
        driver = Hooks.driver;
    }

    @Given("^I'm on google\\.co\\.uk main page$")
    public void openGoogleMainPage() throws Throwable {
        driver.get("http://www.google.co.uk");
        Thread.sleep(5000);
    }

}
