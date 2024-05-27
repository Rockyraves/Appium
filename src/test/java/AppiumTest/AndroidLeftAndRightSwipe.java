package AppiumTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AndroidLeftAndRightSwipe {

	public static void main(String[] args) throws Exception {
		
		AppiumDriver driver=CreateDriver.initializeDriver("Android");
		AndroidLeftSwipe(driver);
		AndroidRightSwipe(driver);
		

	}
	public static void AndroidLeftSwipe(AppiumDriver driver)
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		WebElement ele=driver.findElement(AppiumBy.xpath("(//*[@resource-id='io.appium.android.apis:id/gallery']"
				+ "/android.widget.ImageView)[1]"));
		driver.executeScript("mobile:swipeGesture",ImmutableMap.of(
				"elementId",((RemoteWebElement)ele).getId(),
				"direction","left",
				"percent",0.75));
	}
	public static void AndroidRightSwipe(AppiumDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement ele2=driver.findElement(AppiumBy.xpath("(//*[@resource-id='io.appium.android.apis:id/gallery']"
				+ "/android.widget.ImageView)[1]"));
		driver.executeScript("mobile:swipeGesture", ImmutableMap.of(
				"elementId",((RemoteWebElement)ele2).getId(),
				"direction","right",
				"percent",1.0));
		
	}

}
