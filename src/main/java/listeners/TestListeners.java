package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Attachment;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class TestListeners implements ITestListener {

    private static WebDriver driver;

    // Allow driver to be set from your test setup
    public static void setDriver(WebDriver driverInstance) {
        driver = driverInstance;
    }

    // Attach screenshot to Allure report
    @Attachment(value = "Failure Screenshot", type = "image/png")
    public byte[] attachScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    // Save screenshot to your screenshots folder
    public void saveScreenshotToFolder(String testName) {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File("screenshots/" + testName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        saveScreenshotToFolder(result.getName());
        attachScreenshot();
    }
}
