package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;

public class PriceOptionPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By selectSilver = By.id("selectsilver");
    private By nextSendQuote = By.id("nextsendquote");

    public PriceOptionPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void selectSilverOption() {
        WebElement selectSilverButton = driver.findElement(selectSilver);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectSilverButton);
    }

    public void clickNextButton() {
        WebElement nextButtonElement = wait.until(ExpectedConditions.elementToBeClickable(nextSendQuote));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextButtonElement);
    }
}
