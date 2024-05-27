package AppiumTest;

import java.time.Duration;

import io.appium.java_client.AppiumDriver;

public class AndroidAutomateBrowser {

	public static void main(String[] args) throws Exception {
	AppiumDriver driver=CreateBrowserSession.initializeDriver("Android");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.tesla.com");
	Thread.sleep(5000);
		
	}

}
