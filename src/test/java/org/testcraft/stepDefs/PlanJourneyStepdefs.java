package org.testcraft.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.testcraft.pages.MainPage;

import static org.testcraft.stepDefs.Hooks.driver;

public class PlanJourneyStepdefs {

    MainPage mainPage;

    @Given("^I'm on trainline.com main page$")
    public void openTrainlineMainPage() throws Throwable {
        mainPage = new MainPage(driver);
        mainPage.open();
    }

    @When("^I enter origin \"([^\"]*)\" and destination \"([^\"]*)\"$")
    public void enterOriginAndDestination(String origin, String destination) {
        mainPage.enterRoute(origin, destination);
    }

    @When("^I click Get times and tickets$")
    public void getTimesAndTickets() {
        mainPage.getTimes();
    }

    @Then("^a list of options are displayed$")
    public void listOptions() {
        //TODO: implement step
    }


}
