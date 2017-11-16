package uk.co.testcraft.stepDefs;

import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchStepDefs implements En {

    public WebDriver driver = new ChromeDriver();

    public GoogleSearchStepDefs() {

        Given("^I'm on google\\.co\\.uk main page$", () -> {
            driver.get("https://www.google.co.uk");
            Thread.sleep(3000);
        });

        When("^I enter search phrase \"([^\"]*)\"$", (String arg1) -> {
            System.out.println("Step 2: " + arg1);
        });

        When("^I click search$", () -> {
            System.out.println("Step 3");
        });

        Then("^Link \"([^\"]*)\" should be displayed as first one$", (String arg1) -> {
            System.out.println("Step 4: " + arg1);
            driver.quit();
        });


    }
}