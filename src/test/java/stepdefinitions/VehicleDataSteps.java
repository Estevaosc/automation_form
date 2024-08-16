package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.VehicleDataPage;
import utils.WebDriverManager;

import static org.junit.Assert.assertTrue;

public class VehicleDataSteps {

    private WebDriver driver;
    private WebDriverWait wait;
    private VehicleDataPage vehicleDataPage;

    public VehicleDataSteps() {
        this.driver = WebDriverManager.getDriver();
        this.wait = WebDriverManager.getWait();
        this.vehicleDataPage = new VehicleDataPage(driver, wait);
    }

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        driver.get("https://sampleapp.tricentis.com/101/app.php");
    }

    @When("I click on {string}")
    public void i_click_on(String menuOption) {
        WebElement menu = driver.findElement(By.id("nav_" + menuOption.toLowerCase()));
        menu.click();
    }

    @When("I wait for the page to reload")
    public void i_wait_for_the_page_to_reload() {
        // Pode ser necessário adaptar este método, dependendo de como a página é carregada
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("make")));
    }

    @Given("I should be on the Vehicle Data page")
    public void i_should_be_on_the_vehicle_data_page() {
        WebElement vehicleDataTab = driver.findElement(By.id("make"));
        wait.until(ExpectedConditions.visibilityOf(vehicleDataTab));
    }

    @Given("I am on the Vehicle Data page")
    public void i_am_on_the_vehicle_data_page() {
        assertTrue(vehicleDataPage.isMakeDropdownVisible());
    }

    @When("I enter the vehicle data")
    public void i_enter_the_vehicle_data() {
        vehicleDataPage.selectMake("Audi");
        vehicleDataPage.enterEnginePerformance("100");
        vehicleDataPage.enterDateOfManufacture("01/01/2024");
        vehicleDataPage.selectNumberOfSeats("2");
        vehicleDataPage.selectFuelType("Petrol");
        vehicleDataPage.enterListPrice("1000");
        vehicleDataPage.enterLicensePlateNumber("XYZ-123");
        vehicleDataPage.enterAnnualMileage("500");
        vehicleDataPage.clickNextButton();
    }

    @Then("I should see the Insurant Data tab")
    public void i_should_be_on_the_insurant_data_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname")));
    }
}
