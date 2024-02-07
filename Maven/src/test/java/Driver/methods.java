package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class methods {
	static WebDriver d;
	driver dr=new driver(d);
	public void xpath() {
		d.findElement(By.id("UserName")).sendKeys("dssd");
		
		
	}
}
