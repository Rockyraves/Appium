package AppiumTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CreateDriverSession {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		//cap.setCapability("appium:deviceName", "9cfd6957");
		cap.setCapability("appium:automationName", "uiautomator2");
		cap.setCapability("appium:udid", "9cfd6957");
		String appUrl=System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"ApiDemos-debug.apk";
		cap.setCapability("appium:app", appUrl);
		
		URL url=new URL("http://0.0.0.0:4723");
		
		AppiumDriver driver=new AndroidDriver(url, cap);
		

	}

}
