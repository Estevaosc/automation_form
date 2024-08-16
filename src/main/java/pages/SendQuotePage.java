package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SendQuotePage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By emailField = By.id("email");
    private By phoneField = By.id("phone");
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By confirmPasswordField = By.id("confirmpassword");
    private By commentsField = By.id("Comments");
    private By sendButton = By.id("sendemail");
    private By successMessage = By.xpath("//*[contains(text(), 'Sending e-mail success!')]");

    public SendQuotePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void fillEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField)).sendKeys(email);
    }

    public void fillPhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void fillUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void fillPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void confirmPassword(String password) {
        driver.findElement(confirmPasswordField).sendKeys(password);
    }

    public void addComments(String comments) {
        driver.findElement(commentsField).sendKeys(comments);
    }

    public void clickSendButton() {
        driver.findElement(sendButton).click();
    }

    public boolean isConfirmationMessageVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).isDisplayed();
    }
}
