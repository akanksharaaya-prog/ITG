package tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.SauceLabLogin;

public class SauceLabLoginTest extends BaseClass {

    @Test
    public void testValidLogin() {
        driver.get(configReader.getProperty("urlSauceLab"));
        SauceLabLogin sauceLabLogin = new SauceLabLogin(driver, Integer.parseInt(configReader.getProperty("timeout")));
        sauceLabLogin.enterUsername(configReader.getProperty("usernameSauceLab"));
        sauceLabLogin.enterPassword(configReader.getProperty("passwordSauceLab"));
        sauceLabLogin.clickLogin();
    }

}
