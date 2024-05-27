package AppiumTest;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class InteractingWithApps {

	public static void main(String[] args) throws Exception {

		AppiumDriver driver = CreateDriver.initializeDriver("Android");//60c
		By views=AppiumBy.accessibilityId("Views");
		driver.findElement(views).click();
		Thread.sleep(3000);
		((AndroidDriver)driver).quit();
		//((AndroidDriver)driver).removeApp("io.appium.android.apis");
		//This method is used to remove the app from the device.
//		System.out.println(((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
//		Thread.sleep(5000);
//		((AndroidDriver)driver).terminateApp("io.appium.android.apis");
//		Thread.sleep(5000);
//		System.out.println(((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
		
//		((AndroidDriver)driver).terminateApp("io.appium.android.apis");
		// This method is used to terminate the app , and app will be moved to
		// background.
//		Thread.sleep(5000);
//		String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
//				+ File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
//
//		((AndroidDriver) driver).installApp(appUrl, new AndroidInstallApplicationOptions().withReplaceEnabled());
		
//		boolean var=((AndroidDriver)driver).isAppInstalled("io.appium.android.apis");
//		System.out.println(var);
	
		//((AndroidDriver)driver).runAppInBackground(Duration.ofSeconds(5));
		
//		Thread.sleep(5000);
//		((AndroidDriver)driver).activateApp("com.bijleebuddy");
//		Thread.sleep(5000);
//		((AndroidDriver)driver).activateApp("io.appium.android.apis");
		
	}

}
