package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class VehicleDataPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private By makeDropdown = By.id("make");
    private By enginePerformance = By.id("engineperformance");
    private By dateOfManufacture = By.id("dateofmanufacture");
    private By numberOfSeats = By.id("numberofseats");
    private By fuelType = By.id("fuel");
    private By listPrice = By.id("listprice");
    private By licensePlateNumber = By.id("licenseplatenumber");
    private By annualMileage = By.id("annualmileage");
    private By nextButton = By.id("nextenterinsurantdata");

    public VehicleDataPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isMakeDropdownVisible() {
        WebElement makeDropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(makeDropdown));
        return makeDropdownElement.isDisplayed();
    }

    public void selectMake(String make) {
        WebElement makeDropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(makeDropdown));
        makeDropdownElement.click();
        makeDropdownElement.sendKeys(make);
    }

    public void enterEnginePerformance(String performance) {
        driver.findElement(enginePerformance).sendKeys(performance);
    }

    public void enterDateOfManufacture(String date) {
        driver.findElement(dateOfManufacture).sendKeys(date);
    }

    public void selectNumberOfSeats(String seats) {
        driver.findElement(numberOfSeats).sendKeys(seats);
    }

    public void selectFuelType(String fuel) {
        driver.findElement(fuelType).sendKeys(fuel);
    }

    public void enterListPrice(String price) {
        driver.findElement(listPrice).sendKeys(price);
    }

    public void enterLicensePlateNumber(String license) {
        driver.findElement(licensePlateNumber).sendKeys(license);
    }

    public void enterAnnualMileage(String mileage) {
        driver.findElement(annualMileage).sendKeys(mileage);
    }

    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }
}
