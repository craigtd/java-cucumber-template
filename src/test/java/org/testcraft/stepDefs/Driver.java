package org.testcraft.stepDefs;

import cucumber.runtime.java.guice.ScenarioScoped;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@ScenarioScoped
public class Driver {
    WebDriver driver;

    public WebDriver Driver() {
        return driver = new ChromeDriver();
    }
}
