package tests;

import org.testng.annotations.Test;
import base.BaseClass;
import pages.FlipkartPage;
import pages.YoutubePage;
import util.ScreenshotUtil;

public class FlipkartTest extends BaseClass {
	@Test
	public void shopping() {

		String testName = "testYoutubeSearchPlay";

		try {

			driver.get(configReader.getProperty("urlA"));

			FlipkartPage flipkart = new FlipkartPage(
					driver,
					Integer.parseInt(configReader.getProperty("timeout")));
			
			flipkart.searchProduct(configReader.getProperty("Product"));
			flipkart.seeoptions();
			flipkart.schrolldown();
			
			// Screenshot
			ScreenshotUtil.captureScreenshot(driver, testName + "_PASS");

		} catch (Exception e) {
			// FAIL Screenshot
			ScreenshotUtil.captureScreenshot(driver, testName + "_FAIL");
			throw e;
		}
	}
}
