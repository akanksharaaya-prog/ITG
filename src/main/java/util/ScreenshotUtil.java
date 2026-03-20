package util;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {

    public static String captureScreenshot(WebDriver driver, String testName) {

        String path = System.getProperty("user.dir") + "/screenshots/" + testName + ".png";

        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);

            File dest = new File(path);
            FileUtils.copyFile(src, dest);

            // ✅ Attach screenshot to Allure report
            byte[] screenshotBytes = ts.getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment(testName, new ByteArrayInputStream(screenshotBytes));

        } catch (IOException e) {
            System.out.println("Screenshot not captured: " + e.getMessage());
        }

        return path;
    }
}