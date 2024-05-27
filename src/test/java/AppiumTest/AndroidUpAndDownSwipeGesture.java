package AppiumTest;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AndroidUpAndDownSwipeGesture {

	public static void main(String[] args) throws Exception {
		AppiumDriver driver=CreateDriver.initializeDriver("Android");
		upSwipeGesture(driver);
		
		downSwipeGesture(driver);
		

	}
	public static void upSwipeGesture(AppiumDriver driver)
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		driver.executeScript("mobile:swipeGesture", 
				ImmutableMap.of(
						"left",128,
						"top",425,
						"width",404,
						"height",621,
						"direction","up",
						"percent",0.75
						
						));
	}
	
	public static void downSwipeGesture(AppiumDriver driver) throws InterruptedException
	{
		//driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(3000);
		driver.executeScript("mobile:swipeGesture", 
				ImmutableMap.of(
						"left",138,
						"top",408,
						"width",455,
						"height",612,
						"direction","down",
						"percent",0.75
						
						));
	}

}
