package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.WaitHelper;

public class FlipkartPage {
	WebDriver driver;
	WaitHelper wait;

	private By searchProduct = By.id("twotabsearchtextbox");
	private By ent_number = By.xpath("/html/body/div[5]/div/div/div/div[2]/div/form/div[1]/input");
	private By see_options = By.id("a-autoid-1-announce");
	private By Scroll=By.id("productDescription");
//	private By skipbutn=By.id("skip-button:v");
	
	public FlipkartPage(WebDriver driver, int timeout){
		this.driver = driver;
		this.wait = new WaitHelper(driver, timeout);
	}
	public void searchProduct(String Product) {
		wait.waitForVisibility(searchProduct).sendKeys(Product);
		Actions ac= new Actions(driver);
		ac.sendKeys(Keys.ENTER).perform();
	}
	public void seeoptions() {
		wait.waitForVisibility(see_options).click();
		
		}
	public void schrolldown() {
		Actions ac = new Actions(driver);
		ac.scrollToElement((WebElement) Scroll).perform();
		
		}
}
