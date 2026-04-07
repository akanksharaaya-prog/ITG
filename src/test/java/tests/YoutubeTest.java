package tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.YoutubePage;
import util.ScreenshotUtil;

public class YoutubeTest extends BaseClass {

    @Test
    public void testValidLoginAndLogout() {

        String testName = "testYoutubeSearchPlay";

        try {

            driver.get(configReader.getProperty("url1"));

            YoutubePage youtube = new YoutubePage(
                driver,
                Integer.parseInt(configReader.getProperty("timeout"))
            );

            youtube.searchSong(configReader.getProperty("song"));
            youtube.playsong();


            // ✅ PASS Screenshot
            ScreenshotUtil.captureScreenshot(driver, testName + "_PASS");

        } catch (Exception e) {

            // ❌ FAIL Screenshot
            ScreenshotUtil.captureScreenshot(driver, testName + "_FAIL");

            throw e;
        }
    }
}