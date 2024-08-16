package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.ProductDataPage;
import utils.WebDriverManager;

public class ProductDataSteps {

    private WebDriver driver;
    private WebDriverWait wait;
    private ProductDataPage productDataPage;

    public ProductDataSteps() {
        this.driver = WebDriverManager.getDriver();
        this.wait = WebDriverManager.getWait();
        this.productDataPage = new ProductDataPage(driver, wait);
    }

    @When("I enter the product data and click on the {string} button")
    public void i_enter_the_product_data_and_click_on_the_button(String button) {
        productDataPage.enterStartDate("10/10/2024");
        productDataPage.selectInsuranceSum("3000000");
        productDataPage.selectMeritRating("Super Bonus");
        productDataPage.selectDamageInsurance("No Coverage");
        productDataPage.selectEuroProtection();
        productDataPage.selectCourtesyCar("No");
        productDataPage.clickNextButton();
    }

    @Then("I should see the Select Price Option tab")
    public void i_should_see_the_select_price_option_tab() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("selectsilver")));
    }
}
