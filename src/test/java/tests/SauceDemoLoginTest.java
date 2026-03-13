package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.SauceDemoLoginPage;
import util.ConfigReader;


public class SauceDemoLoginTest extends BaseClass  {

	 @Test
	    public void testValidLogin() {
		 driver.get(configReader.getProperty("url6"));
SauceDemoLoginPage loginpageSD=new SauceDemoLoginPage(driver, Integer.parseInt(configReader.getProperty("timeout")));
loginpageSD.enterUsername(configReader.getProperty("username2"));
loginpageSD.enterPassword(configReader.getProperty("password143"));
loginpageSD.LoginButton();
	 }
	 }


