package AppiumTest;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ValidationAppium {
	

	public static void main(String[] args) throws Exception {
		
		By accessbility=AppiumBy.accessibilityId("Accessibility");
		
		AppiumDriver driver=CreateDriver.initializeDriver("Android");
		
		Thread.sleep(3000);
		
		String ele=driver.findElement(accessbility).getAttribute("displayed");
		if(ele.equals("true"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	

	}

}
