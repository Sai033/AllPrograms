package frameworks;

import io.appium.java_client.android.AndroidDriver;

public class Application {
	
public static void main(String[] args) throws Exception {
	AndroidDriver d=BaseClass.getAndroidDriver();
		Thread.sleep(4000);
	d.findElementByXPath("//android.widget.TextView[@content-desc=\"Phone\"]").click();
	}
}
