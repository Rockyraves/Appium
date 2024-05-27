package AppiumTest;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;

public class AndroidGesturesZoomIn {

	public static void main(String[] args) throws Exception {
		AppiumDriver driver=CreateDriver.initializeDriver("Android");
		zoomInGesture(driver);
		//zoomOutGesture(driver);
		

	}
	public static void zoomInGesture(AppiumDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
			    "left",200,
			    "top",800,
			    "width",600,
			    "height",900,
			    "percent", 0.99
			));
	}
	
//	public static void zoomOutGesture(AppiumDriver driver) throws InterruptedException
//	{
//		Thread.sleep(5000);
//		driver.executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
//			    "left",200,
//			    "top",800,
//			    "width",600,
//			    "height",900,
//			    "percent", 0.99
//			));
//	}
	
	
	
	
	
	
	
	

}
