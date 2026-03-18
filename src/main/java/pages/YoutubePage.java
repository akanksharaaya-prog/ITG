package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.WaitHelper;

public class YoutubePage {
	WebDriver driver;
	WaitHelper wait;

	private By searchbox = By.name("search_query");
	private By searchBtn = By.className("ytSearchboxComponentSearchButton");
	private By clickonsong=By.id("video-title");
	private By skipbutn=By.id("skip-button:v");
	
	public YoutubePage(WebDriver driver, int timeout) {
		this.driver = driver;
		this.wait = new WaitHelper(driver, timeout);
	}

	public void searchSong(String song) {
		wait.waitForVisibility(searchbox).sendKeys(song);
		wait.waitForVisibility(searchBtn).click();	
	}
	public void playsong() {
		wait.waitForVisibility(clickonsong).click();
	}
	public void skipadd() {
		wait.waitForVisibility(skipbutn).click();
	}
}


