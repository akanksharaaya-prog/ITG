package tests;

import base.BaseClass;
import listeners.TestListeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import pages.LogoutHRM;

@Listeners(TestListeners.class) 
public class LogoutTestHRM extends BaseClass {


    @Test(description = "Valid logout from HRM application")
    public void testValidLogoutHRM() {

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
    }
}