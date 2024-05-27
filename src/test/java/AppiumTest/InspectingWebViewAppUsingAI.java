package AppiumTest;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class InspectingWebViewAppUsingAI {

	public static void main(String[] args) throws Exception {
		
		AppiumDriver driver=CreateDriver.initializeDriver("Android");
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		scrollScreen(driver);
		driver.findElement(AppiumBy.accessibilityId("WebView2")).click();
		Thread.sleep(3000);
		//By textLoc=AppiumBy.androidUIAutomator("new UiAutomator().text(\"This page is a Second Selenium sandbox\")");
		//String text=driver.findElement(textLoc).getText();
		//((AndroidDriver)driver).runAppInBackground(Duration.ofSeconds(5));
		Thread.sleep(3000);
		String text=driver.findElement(AppiumBy.xpath("(//android.webkit.WebView/android.widget.TextView)[1]")).getText();
		System.out.println(text);
		if(text.contains("Selenium"))
		{
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");
	}
	
	public static void scrollScreen(AppiumDriver driver)
	{
		boolean flag=true;
		while(flag)
		{
			flag=(boolean)driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
					"left",100,
					"top",100,
					"width",800,
					"height",800,
					"direction","down",
					"percent",0.80));
		}
	}
	
	
}
