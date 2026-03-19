package tests;

import base.BaseClass;
//import listeners.TestListeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.SauceLabLogin;

//@Listeners(TestListeners.class) 
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
