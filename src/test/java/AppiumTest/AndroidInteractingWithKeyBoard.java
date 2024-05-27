package AppiumTest;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AndroidInteractingWithKeyBoard {

	public static void main(String[] args) throws Exception {

		AppiumDriver driver = CreateDriver.initializeDriver("Android");
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		scroll(driver);
		driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
		driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit2")).click();
		System.out.println(((AndroidDriver) driver).isKeyboardShown());
		((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.B));
		Thread.sleep(3000);
		((AndroidDriver) driver).hideKeyboard();

	}

	public static void scroll(AppiumDriver driver) {
		boolean flag = true;
		while (flag) {
			flag = (boolean) driver.executeScript("mobile:scrollGesture", ImmutableMap.of("left", 100, "top", 100,
					"width", 800, "height", 800, "direction", "down", "percent", 0.80));
			System.out.println(flag);
		}

	}

}
