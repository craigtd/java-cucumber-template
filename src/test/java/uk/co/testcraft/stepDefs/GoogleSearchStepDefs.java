package uk.co.testcraft.stepDefs;

import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import uk.co.testcraft.pages.GooglePage;

public class GoogleSearchStepDefs implements En {

    private WebDriver driver = new ChromeDriver();

    GooglePage googlePage = new GooglePage(driver);

    public GoogleSearchStepDefs() {

        Given("^I'm on google\\.co\\.uk main page$", () -> {
            googlePage.goTo();
        });

        When("^I enter search phrase \"([^\"]*)\"$", (String criteria) -> {
            googlePage.searchFor(criteria);
        });

        When("^I click search$", () -> {
            // Nothing to do - covered in previous step
        });

        Then("^Link \"([^\"]*)\" should be displayed as first one$", (String firstResult) -> {
            assertThat(googlePage.getResults().get(0).getText(), is(equalTo(firstResult)));
            googlePage.quit();
        });

    }
}