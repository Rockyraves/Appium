package AppiumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.Immutable;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AndroidGesturesLongClick {

	public static void main(String[] args) throws Exception {

		AppiumDriver driver=CreateDriver.initializeDriver("Android");
		AndroidGesturesLongClick.longClick(driver);
		
	
	}
	
	public static void longClick(AppiumDriver driver)
	{
		By views=AppiumBy.accessibilityId("Views");
		By dragAndDrop=AppiumBy.accessibilityId("Drag and Drop");
		driver.findElement(views).click();
		driver.findElement(dragAndDrop).click();
		WebElement element=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
//		driver.executeScript("mobile:longClickGesture",
//				ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),
//						"duration",1000));
		driver.executeScript("mobile:longClickGesture",
				ImmutableMap.of("x",159,"y",431,"duration",1000));
	}

}
