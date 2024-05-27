package AppiumTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class CreateDriverSessionUsingOptions {

	public static void main(String[] args) throws MalformedURLException {
		String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
				+ File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
		UiAutomator2Options options = new UiAutomator2Options()
				//.setAutomationName("UiAutomator2")
				//.setUdid("9cfd6957")
				.setDeviceName("New Device")
				.setAppPackage("io.appium.android.apis")
				.setAppActivity("io.appium.android.apis.accessibility.CustomViewAccessibilityActivity")
				.setAvd("New_Device_1")
				.setAvdLaunchTimeout(Duration.ofSeconds(120));
	           	
		//.setApp(appUrl);
				
		
		URL url=new URL("http://0.0.0.0:4723");
		AppiumDriver driver=new AndroidDriver(url,options);
		
		//adb shell "dumpsys activity activities | grep mResumedActivity"-Manifeste xml
		

	}

}
