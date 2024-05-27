package AppiumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AndroidGesturesDragAndDrop {

	public static void main(String[] args) throws Exception {
		
		AppiumDriver driver=CreateDriver.initializeDriver("Android");
		dragAndDropFun(driver);
		
		

	}

	public static void dragAndDropFun(AppiumDriver driver) {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		WebElement element = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
		driver.executeScript("mobile:dragGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "endX", 474, "endY", 441));

		By dropped = AppiumBy.androidUIAutomator("new UiSelector().text(\"Dropped!\")");
		String text=driver.findElement(dropped).getText();
		if (text.equals("Dropped!")) {
			System.out.println("Pass !!!");
		} else
			System.out.println("Fail....");

	}
}
