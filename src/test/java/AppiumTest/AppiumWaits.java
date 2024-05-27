package AppiumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AppiumWaits {

	public static void main(String[] args) throws Exception {
		
		By accessbility=AppiumBy.accessibilityId("Accessibility");
		By CustomView=AppiumBy.accessibilityId("Custom View");
		
		AppiumDriver driver=CreateDriver.initializeDriver("Android");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(accessbility)).click();		
		wait.until(ExpectedConditions.visibilityOfElementLocated(CustomView)).click();

	}

}
