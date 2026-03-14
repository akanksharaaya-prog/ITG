package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.WaitHelper;

public class LoginpageAPForm {
	
		WebDriver driver;
		WaitHelper wait;
		private By Firstname = By.xpath("//input[@id='firstname']");
		private By Lastname = By.xpath("//input[@id='lastname']");
		private By Username = By.xpath("//input[@id='username']");
		private By Password =By.xpath("//input[@id='password']");
		private By BacktoLogin=By.xpath("//a[@class='btn btn-primary ms-4']");
		public LoginpageAPForm(WebDriver driver ,int timeout) {
	this.driver=driver;
	this.wait= new WaitHelper(driver, timeout);
		}
	public void enterFirstname(String firstname) {
		wait.waitForVisibility(Firstname).sendKeys(firstname);
	}
	public void enterLastname(String lastname) {
		wait.waitForVisibility(Lastname).sendKeys(lastname);
	}

	public void enterUsername(String username) {
		wait.waitForVisibility(Username).sendKeys(username);
		
	}
	public void enterPassword(String password2) {
		wait.waitForVisibility(Password).sendKeys(password2);
	}
	public void BacktoLogin() {
		wait.waitForVisibility(BacktoLogin).click();
	}
	}


