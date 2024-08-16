package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;

public class ProductDataPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By startDate = By.id("startdate");
    private By insuranceSum = By.id("insurancesum");
    private By meritRating = By.id("meritrating");
    private By damageInsurance = By.id("damageinsurance");
    private By euroProtection = By.id("EuroProtection");
    private By courtesyCar = By.id("courtesycar");
    private By nextButton = By.id("nextselectpriceoption");

    public ProductDataPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void enterStartDate(String date) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(startDate)).sendKeys(date);
    }

    public void selectInsuranceSum(String sum) {
        driver.findElement(insuranceSum).sendKeys(sum);
    }

    public void selectMeritRating(String rating) {
        driver.findElement(meritRating).sendKeys(rating);
    }

    public void selectDamageInsurance(String insurance) {
        driver.findElement(damageInsurance).sendKeys(insurance);
    }

    public void selectEuroProtection() {
        WebElement euroProtectionButton = driver.findElement(euroProtection);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", euroProtectionButton);
    }

    public void selectCourtesyCar(String option) {
        driver.findElement(courtesyCar).sendKeys(option);
    }

    public void clickNextButton() {
        WebElement nextButtonElement = wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextButtonElement);
    }
}
