package AppiumTest;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CreateDriver {
	
	public static AppiumDriver initializeDriver(String platformName) throws Exception
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", platformName);
		cap.setCapability("newCommandTimeout", 300);
		
		URL url=new URL("http://0.0.0.0:4723");
		
		switch (platformName) {
		case "Android":
			cap.setCapability("appium:udid","9cfd6957");
			cap.setCapability("appium:automationName", "uiautomator2");
			String appUrl=System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"ApiDemos-debug.apk";
			cap.setCapability("appium:app",appUrl);
			//cap.setCapability("unlockType", "pin");
			//cap.setCapability("unlockKey", "159159");
//			cap.setCapability("appPackage", "com.lexa.fakegps");
//			cap.setCapability("appActivity", "com.lexa.fakegps.ui.Main");
			return new AndroidDriver(url,cap);
		case "iOS":
			cap.setCapability("appium:deviceName","New Device");
			cap.setCapability("appium:automationName", "uiautomator2");
			String iOSappUrl=System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"ApiDemos-debug.apk";
			cap.setCapability("appium:app",iOSappUrl);
			//cap.setCapability("appPackage", "io.appium.android.apis");
			//cap.setCapability("appActivity", "io.appium.android.apis.accessibility.CustomViewAccessibilityActivity");
			return new AndroidDriver(url,cap);
		default:
			throw new Exception("Invalid Platform!!!");
			
		}
		
		
	}

}
