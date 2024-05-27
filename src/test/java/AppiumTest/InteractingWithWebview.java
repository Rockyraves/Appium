package AppiumTest;

import java.util.Set;

import org.openqa.selenium.By;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class InteractingWithWebview {

	public static void main(String[] args) throws Exception {
		
		AppiumDriver driver=CreateDriver.initializeDriver("Android");
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		scrollScreen(driver);
		driver.findElement(AppiumBy.accessibilityId("WebView")).click();
		Set<String> contexthandles= ((AndroidDriver)driver).getContextHandles();
		for(String ele:contexthandles)
		{
			System.out.println(ele);
		}
		((AndroidDriver)driver).context(contexthandles.toArray()[1].toString());
		String text=driver.findElement(By.xpath("//h1")).getText();
		System.out.println(text);
		if(text.contains("Selenium"))
		{
			System.out.println("Pass");
		}
		else
			System.out.println();
	
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
