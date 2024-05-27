package AppiumTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class CreateNewDriverSession {

	public static void main(String[] args) throws MalformedURLException {
		
		String appUrl=System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"ApiDemos-debug.apk";
		UiAutomator2Options opt=new UiAutomator2Options()
		.setDeviceName("New Device")
		.setApp(appUrl)
		.setNewCommandTimeout(Duration.ofSeconds(120));
		
		URL url= new URL("http://0.0.0.0:4723");
		AppiumDriver driver=new AndroidDriver(url,opt);
		System.out.println("driver :"+ driver.getSessionId());
	
		
	}

}
