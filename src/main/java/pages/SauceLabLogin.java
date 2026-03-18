package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.WaitHelper;

public class SauceLabLogin {

    WebDriver driver;
    WaitHelper wait;

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginBtn = By.id("login-button");

    public SauceLabLogin(WebDriver driver, int timeout) {
        this.driver = driver;
        this.wait = new WaitHelper(driver, timeout);
    }

    public void enterUsername(String username) {
        wait.waitForVisibility(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        wait.waitForVisibility(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        wait.waitForVisibility(loginBtn).click();
    }
}
