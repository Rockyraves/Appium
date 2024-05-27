package AppiumTest;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AndroidFindElement {

	public static void main(String[] args) throws Exception {
		
		AppiumDriver driver=CreateDriver.initializeDriver("Android");
//		WebElement ele=driver.findElement(AppiumBy.accessibilityId("Accessibility"));
//		System.out.println("Using Accessibiblity id :The text is "+ele.getText());
//		
//		WebElement ele1=driver.findElement(AppiumBy.id("android:id/text1"));
//		System.out.println("Text using ID "+ele1.getText());
		
//		WebElement ele2=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
//		System.out.println("Text using xpath "+ele2.getText());
//		
//		WebElement ele3=driver.findElement(AppiumBy.xpath("//*[@text=\"Accessibility\"]"));
//		System.out.println("Text using custom xpath is "+ele3.getText());

		List<WebElement> ele=driver.findElements(AppiumBy.className("android.widget.TextView"));
		System.out.println(ele.get(2).getText());
	
		
		
	}

}
