package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {
	webElements e=new webElements();
	WebDriver d;
	Driver dr=new Driver(d);
	public void SendelementFound(String xpath,String data) {
		WebDriverWait w=new WebDriverWait(d,Duration.ofSeconds(10));
		WebElement z=d.findElement(By.xpath(xpath));
		try {
		w.until(ExpectedConditions.elementToBeClickable(z));
           z.sendKeys(data);
		}
		catch(Exception e) {
			System.out.println(e+"element not found");
		}
	}

}
