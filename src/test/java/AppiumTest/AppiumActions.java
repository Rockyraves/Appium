package AppiumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AppiumActions {

	public static void main(String[] args) throws Exception {
		
		By views=AppiumBy.accessibilityId("Views");
		By textfields=AppiumBy.accessibilityId("TextFields");
		By textfield=AppiumBy.id("io.appium.android.apis:id/edit");
		
		AppiumDriver driver=CreateDriver.initializeDriver("Android");
		driver.findElement(views).click();
		Thread.sleep(3000);
		
		 WebElement element = driver.findElement(AppiumBy.id("android:id/list"));

	        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
	                "elementId", ((RemoteWebElement) element).getId(),
	                "direction", "up",
	                "percent", 0.75
	        ));
	        
	        WebElement element1 = driver.findElement(AppiumBy.id("android:id/list"));

	        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
	                "elementId", ((RemoteWebElement) element1).getId(),
	                "direction", "up",
	                "percent", 0.75
	        ));
		
	        WebElement element2 = driver.findElement(AppiumBy.id("android:id/list"));

	        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
	                "elementId", ((RemoteWebElement) element2).getId(),
	                "direction", "up",
	                "percent", 0.75
	        ));
	        
		driver.findElement(textfields).click();
		driver.findElement(textfield).sendKeys("My Name is Raveesh!!!");
		Thread.sleep(3000);
		driver.findElement(textfield).clear();
	

	}

}
