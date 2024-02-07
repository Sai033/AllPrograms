package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverLaunching {
	public static WebDriver dr;

	public WebDriverLaunching(WebDriver d) {
		WebDriverLaunching.dr=d;
	
		dr=new FirefoxDriver();
		
	}
}
