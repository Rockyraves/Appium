package AppiumTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AndLockAndUnlockScreen {

	public static void main(String[] args) throws Exception {
		AppiumDriver driver=CreateDriver.initializeDriver("Android");
		//((AndroidDriver)driver).lockDevice(Duration.ofSeconds(5));
		((AndroidDriver)driver).lockDevice();
		System.out.println(((AndroidDriver)driver).isDeviceLocked());
		((AndroidDriver)driver).unlockDevice();
		
	}

}
