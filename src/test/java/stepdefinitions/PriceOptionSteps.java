package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.PriceOptionPage;
import utils.WebDriverManager;

public class PriceOptionSteps {

    private WebDriver driver;
    private WebDriverWait wait;
    private PriceOptionPage priceOptionPage;

    public PriceOptionSteps() {
        this.driver = WebDriverManager.getDriver();
        this.wait = WebDriverManager.getWait();
        this.priceOptionPage = new PriceOptionPage(driver, wait);
    }

    @When("I select the price option {string}")
    public void i_select_the_price_option(String option) {
        priceOptionPage.selectSilverOption();
        priceOptionPage.clickNextButton();
    }

    @Then("I should see the Send Quote tab")
    public void i_should_be_on_the_send_quote_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
    }
}
