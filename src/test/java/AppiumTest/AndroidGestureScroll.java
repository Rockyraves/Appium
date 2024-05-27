package AppiumTest;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AndroidGestureScroll {

	public static void main(String[] args) throws Exception {
		
		AppiumDriver driver=CreateDriver.initializeDriver("Android");
		scrollByBoolean(driver);
		scrollUpUsingElementId(driver);
		
		

	}
	
	//Scroll using coordinates
	/*public static void scrollDownGesture(AppiumDriver driver)
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();;
		driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
				"left",100,
				"top",100,
				"width",800,
				"height",800,
				"direction","down",
				"percent",0.75));
	}*/
	
	
	/**
	 * Scroll for the list of the elements
	 * @param driver
	 */
	
	/*public static void scrollDownUsingElement(AppiumDriver driver)
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		WebElement element=driver.findElement(AppiumBy.id("android:id/list"));
		driver.executeScript("mobile:scrollGesture", ImmutableMap.of(
				"elementId",((RemoteWebElement)element).getId(),
				"direction","down",
				"percent",1.0));
		
	}*/
	
	/*public static void scrollDownUsingPerticularElement(AppiumDriver driver)
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		WebElement ele=driver.findElement(AppiumBy.accessibilityId("Animation"));
		driver.executeScript("mobile:scrollGesture", ImmutableMap.of(
				"elementId",((RemoteWebElement)ele).getId(),
				"direction","down",
				"percent",0.9));
	}*/
	
	public static void scrollByBoolean(AppiumDriver driver)
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		boolean canBeScroll=true;
		while(canBeScroll)
		{
			canBeScroll=(boolean)driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
					"left",100,
					"top",100,
					"width",600,
					"height",600,
					"direction","down",
					"percent",0.80));	
			System.out.println(canBeScroll);
		}
		
	}
	
	public static void scrollUpUsingElementId(AppiumDriver driver) throws InterruptedException
	{
		Thread.sleep(3000);
		//WebElement ele=driver.findElement(AppiumBy.accessibilityId("Animation"));
		boolean canWeScrollUp=true;
		while(canWeScrollUp)
		{
			canWeScrollUp=(boolean)driver.executeScript("mobile:scrollGesture", ImmutableMap.of(
					"left",100,
					"top",400,
					"width",800,
					"height",1200,
					"direction","up",
					"percent",0.80));	
			System.out.println(canWeScrollUp);
		}
		
	}
	
	
	
	
	
	
	
	
	
}
