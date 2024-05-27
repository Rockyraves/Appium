package AppiumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AndroidUIAutomator {

	public static void main(String[] args) throws Exception {
		
		AppiumDriver driver=CreateDriver.initializeDriver("Android");
		By element=AppiumBy.androidUIAutomator("new UiSelector().text(\"Accessibility\")");
		WebElement ele=driver.findElement(element);
		System.out.println(ele.getText());
		
		By ele1=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.TextView\")");
		WebElement ele2=driver.findElements(ele1).get(2);
		System.out.println(ele2.getText());
		
	}

}
