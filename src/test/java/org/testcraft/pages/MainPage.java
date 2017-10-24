package org.testcraft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    private static By ORIGIN_FIELD = By.id("originStation");
    private static By DESTINATION_FIELD = By.id("destinationStation");
    private static By GET_TIMES_BUTTON = By.id("submitButton");

    public MainPage(WebDriver driver){
        super(driver);
    }

    public void open() { driver.get("http://www.trainline.com");
    }

    public void enterRoute(String origin, String destination) {
        driver.findElement(ORIGIN_FIELD).sendKeys(origin);
        driver.findElement(DESTINATION_FIELD).sendKeys(destination);
    }

    public void getTimes() {
        driver.findElement(GET_TIMES_BUTTON).click();
    }
}
