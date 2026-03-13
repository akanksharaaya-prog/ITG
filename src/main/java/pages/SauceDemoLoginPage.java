package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.WaitHelper;

public class SauceDemoLoginPage {
	WebDriver driver;
	WaitHelper wait;
	private By Username = By.id("user-name");
	private By Password =By.id("password");
	private By LoginButton=By.id("login-button");
	
	public SauceDemoLoginPage(WebDriver driver ,int timeout) {
		this.driver=driver;
		this.wait= new WaitHelper(driver, timeout);
			}
	public void enterUsername(String username2) {
		wait.waitForVisibility(Username).sendKeys(username2);
		
	}
	public void enterPassword(String password143) {
		wait.waitForVisibility(Password).sendKeys(password143);
	}
	public void LoginButton() {
		wait.waitForVisibility(LoginButton).click();
	}
}
