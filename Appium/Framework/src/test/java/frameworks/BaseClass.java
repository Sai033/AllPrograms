package frameworks;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

		private static AndroidDriver driver; // Static variable to hold the driver instance

	    public static AndroidDriver getAndroidDriver() throws Exception {
	        if (driver == null) {
	            // Create the AndroidDriver instance if it doesn't exist
	            driver = initializeAndroidDriver();
	        }
	        return driver;
	    }
   
	    private static AndroidDriver initializeAndroidDriver() throws Exception {
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
	       URL url=new URL("http://127.0.0.1:4723/wd/hub");
	       AndroidDriver driver=new AndroidDriver(url,capabilities);
	            return driver;
	}
}

