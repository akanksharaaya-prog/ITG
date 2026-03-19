package tests;
import base.BaseClass;
import org.testng.annotations.Test;
import pages.GooglePage;

public class GoogleTest extends BaseClass {

	@Test
	public void testGoogleSearch() {

		driver.get(configReader.getProperty("urlg"));    	

		GooglePage google = new GooglePage(driver, Integer.parseInt(configReader.getProperty("timeout")));
		google.Surfing(configReader.getProperty("search"));


	}
}
