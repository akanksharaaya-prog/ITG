package tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseClass {

    @Test
    public void testValidLoginAndLogout() {
        LoginPage loginPage = new LoginPage(driver, Integer.parseInt(configReader.getProperty("timeout")));
        loginPage.enterEmail(configReader.getProperty("email"));
        loginPage.enterPassword(configReader.getProperty("password"));
        loginPage.profileTab();
    }
}
