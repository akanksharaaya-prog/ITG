package tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.SauceLabLogin;
import util.ScreenshotUtil;

public class SauceLabLoginTest extends BaseClass {

    @Test
    public void testValidLogin() {

        String testName = "testValidLogin_SauceLab";

        try {

            driver.get(configReader.getProperty("urlSauceLab"));

            SauceLabLogin sauceLabLogin = new SauceLabLogin(
                driver,
                Integer.parseInt(configReader.getProperty("timeout"))
            );

            sauceLabLogin.enterUsername(configReader.getProperty("usernameSauceLab"));
            sauceLabLogin.enterPassword(configReader.getProperty("passwordSauceLab"));
            sauceLabLogin.clickLogin();

            // ✅ PASS Screenshot
            ScreenshotUtil.captureScreenshot(driver, testName + "_PASS");

        } catch (Exception e) {

            // ❌ FAIL Screenshot
            ScreenshotUtil.captureScreenshot(driver, testName + "_FAIL");

            throw e;
        }
    }
}