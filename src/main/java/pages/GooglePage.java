package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.WaitHelper;

public class GooglePage {

	WebDriver driver;
	WaitHelper wait;

	private By searchbox = By.className("gLFyf");
	private By searchBtn = By.className("lTxWLe");
	private By clickonsong=By.id("video-title");
	private By skipbutn=By.id("skip-button:v");

	public GooglePage(WebDriver driver, int timeout) {
		this.driver = driver;
		this.wait = new WaitHelper(driver, timeout);
	}
	public void Surfing(String search) {
		wait.waitForVisibility(searchbox).sendKeys(search);
		wait.waitForVisibility(searchBtn).click();	
	}
	public void playsong() {
		wait.waitForVisibility(clickonsong).click();
	}
	public void skipadd() {
		wait.waitForVisibility(skipbutn).click();
	}
}
