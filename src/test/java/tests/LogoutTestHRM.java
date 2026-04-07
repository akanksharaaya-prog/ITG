package tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.LogoutHRM;
import util.ScreenshotUtil;

public class LogoutTestHRM extends BaseClass {

    @Test(description = "Valid logout from HRM application")
    public void testValidLogoutHRM() {

        String testName = "testValidLogoutHRM";

        try {

            driver.get(configReader.getProperty("urlHrm"));

            LogoutHRM logoutHRM = new LogoutHRM(
                driver,
                Integer.parseInt(configReader.getProperty("timeout"))
            );

            logoutHRM.enterEmail(configReader.getProperty("emailHrm"));
            logoutHRM.enterPassword(configReader.getProperty("passwordHrm"));
            logoutHRM.loginButton();

            logoutHRM.profileTabBtn();
            logoutHRM.signoutTab();

            // ✅ PASS Screenshot (after logout success)
            ScreenshotUtil.captureScreenshot(driver, testName + "_PASS");

        } catch (Exception e) {

            // ❌ FAIL Screenshot
            ScreenshotUtil.captureScreenshot(driver, testName + "_FAIL");

            throw e;
        }
    }
}