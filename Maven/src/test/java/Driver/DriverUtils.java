// DriverUtils.java - The utility class for creating and managing the WebDriver instance
package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverUtils {
    private static WebDriver driver; // Static variable to hold the driver instance

    public static WebDriver getWebDriver() {
        if (driver == null) {
        	driver = initializeWebDriver();
        }
        return driver;
    }

    private static WebDriver initializeWebDriver() {
        // Set the path to the ChromeDriver executable
        driver=new ChromeDriver();
        return driver;
    }
}
