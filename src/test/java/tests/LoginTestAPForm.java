package tests;

import org.testng.annotations.Test;

import base.BaseClass;

import pages.LoginpageAPForm;


public class LoginTestAPForm extends BaseClass  {

	 @Test
	    public void testValidLogin() {
		 driver.get(configReader.getProperty("url2"));
		 LoginpageAPForm loginpageAp1=new LoginpageAPForm(driver, Integer.parseInt(configReader.getProperty("timeout")));
		 loginpageAp1.enterFirstname(configReader.getProperty("firstname"));
		 loginpageAp1.enterLastname(configReader.getProperty("lastname"));
		 loginpageAp1.enterUsername(configReader.getProperty("username"));
		 loginpageAp1.enterPassword(configReader.getProperty("password2"));
		 loginpageAp1.BacktoLogin();
		 	 }
		 }

