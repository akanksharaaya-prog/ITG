package tests;

import org.testng.annotations.Test;
import base.BaseClass;
import pages.LoginpageAPForm;
import util.ScreenshotUtil;

public class LoginTestAPForm extends BaseClass {

    @Test
    public void testValidLogin() {

        String testName = "testValidLogin";

        try {

            driver.get(configReader.getProperty("url2"));

            LoginpageAPForm loginpageAp1 = new LoginpageAPForm(
                driver,
                Integer.parseInt(configReader.getProperty("timeout"))
            );

            loginpageAp1.enterFirstname(configReader.getProperty("firstname"));
            loginpageAp1.enterLastname(configReader.getProperty("lastname"));
            loginpageAp1.enterUsername(configReader.getProperty("username"));
            loginpageAp1.enterPassword(configReader.getProperty("password2"));
            loginpageAp1.BacktoLogin();

            // ✅ PASS Screenshot (after successful flow)
            ScreenshotUtil.captureScreenshot(driver, testName + "_PASS");

        } catch (Exception e) {

            // ❌ FAIL Screenshot
            ScreenshotUtil.captureScreenshot(driver, testName + "_FAIL");

            // rethrow so TestNG marks it as failed
            throw e;
        }
    }
}