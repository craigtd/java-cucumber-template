package org.testcraft.stepDefs;

import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;

public class GoogleSearchStepdefs implements En {

    public WebDriver driver;

    public void GoogleSearchStepdefs() {

        driver = Hooks.driver;

        Given("^I'm on google\\.co\\.uk main page$", () -> {
            driver.get("http://www.google.co.uk");
        });

    }

}
