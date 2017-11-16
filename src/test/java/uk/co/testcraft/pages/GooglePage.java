package uk.co.testcraft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GooglePage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private static final String URL = "https://www.google.co.uk";

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private WebElement searchButton;

    @FindBy(className = "_Rm")
    private List<WebElement> searchResults;


    public GooglePage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 5);
    }


    public void goTo() {
        this.driver.get(URL);
    }

    public void searchFor(String criteria) {
        this.searchBox.sendKeys(criteria);
        wait.until(ExpectedConditions.elementToBeClickable(this.searchButton));
        // If we wish to submit the form. WebDriver will find the form for us from the element searchBox
        // this.searchBox.submit();
        this.searchButton.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("rc")));
    }

    public List<WebElement> getResults() {
        return this.searchResults;
    }

    public void quit() {
        this.driver.quit();
    }

}
