package tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.YoutubePage;

public class YoutubeTest extends BaseClass {

    @Test
    public void testValidLoginAndLogout() {
    	
    	driver.get(configReader.getProperty("url1"));    	
    	
    	YoutubePage youtube = new YoutubePage(driver, Integer.parseInt(configReader.getProperty("timeout")));
    	
    	youtube.searchSong(configReader.getProperty("song"));
    	youtube.playsong();
    	youtube.skipadd();
    }
}


