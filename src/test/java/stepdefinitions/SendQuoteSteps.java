package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.SendQuotePage;
import utils.WebDriverManager;

import static org.junit.Assert.assertTrue;

public class SendQuoteSteps {

    private WebDriver driver;
    private WebDriverWait wait;
    private SendQuotePage sendQuotePage;

    public SendQuoteSteps() {
        this.driver = WebDriverManager.getDriver();
        this.wait = WebDriverManager.getWait();
        this.sendQuotePage = new SendQuotePage(driver, wait);
    }

    @When("I fill and send the quote")
    public void i_fill_and_send_the_quote() {
        sendQuotePage.fillEmail("exemplo@exemplo.com");
        sendQuotePage.fillPhone("00000000");
        sendQuotePage.fillUsername("usuario");
        sendQuotePage.fillPassword("Abc123");
        sendQuotePage.confirmPassword("Abc123");
        sendQuotePage.addComments("Test Comment");
        sendQuotePage.clickSendButton();
    }

    @Then("I should see a confirmation message")
    public void i_should_see_a_confirmation_message() {
        assertTrue(sendQuotePage.isConfirmationMessageVisible());
    }
}
