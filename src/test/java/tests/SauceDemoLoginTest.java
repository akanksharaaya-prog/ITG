package tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.SauceDemoLoginPage;
import util.ScreenshotUtil;

public class SauceDemoLoginTest extends BaseClass {

    @Test
    public void testValidLogin() {

        String testName = "testValidLogin_SauceDemo";

        try {

            driver.get(configReader.getProperty("url6"));

            SauceDemoLoginPage loginpageSD = new SauceDemoLoginPage(
                driver,
                Integer.parseInt(configReader.getProperty("timeout"))
            );

            loginpageSD.enterUsername(configReader.getProperty("username2"));
            loginpageSD.enterPassword(configReader.getProperty("password143"));
            loginpageSD.LoginButton();

            // ✅ PASS Screenshot (after login success)
            ScreenshotUtil.captureScreenshot(driver, testName + "_PASS");

        } catch (Exception e) {

            // ❌ FAIL Screenshot
            ScreenshotUtil.captureScreenshot(driver, testName + "_FAIL");

            throw e;
        }
    }
}