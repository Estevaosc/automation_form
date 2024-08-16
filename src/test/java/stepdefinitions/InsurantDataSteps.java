package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.InsurantDataPage;
import utils.WebDriverManager;

public class InsurantDataSteps {

    private WebDriver driver;
    private WebDriverWait wait;
    private InsurantDataPage insurantDataPage;

    public InsurantDataSteps() {
        this.driver = WebDriverManager.getDriver();
        this.wait = WebDriverManager.getWait();
        this.insurantDataPage = new InsurantDataPage(driver, wait);
    }

    @When("I enter the insurant data and click Next")
    public void i_enter_the_insurant_data_and_click_next() {
        insurantDataPage.enterFirstName("Fulano");
        insurantDataPage.enterLastName("Ciclano");
        insurantDataPage.enterBirthDate("01/01/2000");
        insurantDataPage.selectGenderMale();
        insurantDataPage.enterStreetAddress("Rua abc");
        insurantDataPage.selectCountry("Brazil");
        insurantDataPage.enterZipCode("00000");
        insurantDataPage.enterCity("Recife");
        insurantDataPage.selectOccupation("Employee");
        insurantDataPage.selectSpeedingHobby();
        insurantDataPage.enterWebsite("www.google.com");
        insurantDataPage.uploadPicture("C:\\Users\\Steve\\Pictures\\7e51612dd79b70a5a114e4c55a6af59a692a6763_full.jpg");
        insurantDataPage.clickNextButton();
    }

    @Then("I should see the Product Data tab")
    public void i_should_be_on_the_product_data_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("startdate")));
    }
}
