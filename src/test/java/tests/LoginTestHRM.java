package tests;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPageHRM;

import java.time.Duration;

public class LoginTestHRM extends BaseClass {

    @Test
    public void testValidLogin() {
        System.out.println(">>> Starting test: testValidLogin");

        driver.get(configReader.getProperty("urlHrm"));
        LoginPageHRM loginPagehrm = new LoginPageHRM(driver, Integer.parseInt(configReader.getProperty("timeout")));
        loginPagehrm.enterEmail(configReader.getProperty("emailHrm"));
        loginPagehrm.enterPassword(configReader.getProperty("passwordHrm"));
        loginPagehrm.loginButton();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement timeAtWork = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(@class,'oxd-text--p') and text()='Time at Work']")));
        Assert.assertEquals(timeAtWork.getText(), "Time at Work", "Login Failed - Time At Work not displayed");
    }
}
