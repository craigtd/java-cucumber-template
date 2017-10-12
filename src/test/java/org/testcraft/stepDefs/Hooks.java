package org.testcraft.stepDefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void openBrowser() {
        driver = new ChromeDriver();
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}
