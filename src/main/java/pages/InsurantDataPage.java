package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;

public class InsurantDataPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By firstName = By.id("firstname");
    private By lastName = By.id("lastname");
    private By birthDate = By.id("birthdate");
    private By genderMale = By.id("gendermale");
    private By streetAddress = By.id("streetaddress");
    private By country = By.id("country");
    private By zipCode = By.id("zipcode");
    private By city = By.id("city");
    private By occupation = By.id("occupation");
    private By speedingHobby = By.id("speeding");
    private By website = By.id("website");
    private By pictureUpload = By.id("open");
    private By nextButton = By.id("nextenterproductdata");

    public InsurantDataPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void enterFirstName(String firstNameValue) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys(firstNameValue);
    }

    public void enterLastName(String lastNameValue) {
        driver.findElement(lastName).sendKeys(lastNameValue);
    }

    public void enterBirthDate(String birthDateValue) {
        driver.findElement(birthDate).sendKeys(birthDateValue);
    }

    public void selectGenderMale() {
        WebElement genderMaleRadioButton = driver.findElement(genderMale);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", genderMaleRadioButton);
    }

    public void enterStreetAddress(String streetAddressValue) {
        driver.findElement(streetAddress).sendKeys(streetAddressValue);
    }

    public void selectCountry(String countryValue) {
        driver.findElement(country).sendKeys(countryValue);
    }

    public void enterZipCode(String zipCodeValue) {
        driver.findElement(zipCode).sendKeys(zipCodeValue);
    }

    public void enterCity(String cityValue) {
        driver.findElement(city).sendKeys(cityValue);
    }

    public void selectOccupation(String occupationValue) {
        driver.findElement(occupation).sendKeys(occupationValue);
    }

    public void selectSpeedingHobby() {
        WebElement speedingButton = driver.findElement(speedingHobby);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", speedingButton);
    }

    public void enterWebsite(String websiteValue) {
        driver.findElement(website).sendKeys(websiteValue);
    }

    public void uploadPicture(String picturePath) {
        driver.findElement(pictureUpload).sendKeys(picturePath);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("picture")));
    }

    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }
}
