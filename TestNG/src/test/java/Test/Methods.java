package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {
	static WebDriver d;
public WebDriver Browser() {
	if(d==null) {
		d=initialize();
	}
	return d;
}
public WebDriver initialize() {
	d=new ChromeDriver();
	return d;
	
}
static WebDriverWait w=new WebDriverWait(d,Duration.ofSeconds(10));
public void xpathClick(String xpath,String elementName) {
	
	try {
		WebElement z=w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	boolean element=z.isDisplayed();
	if(element) {
		z.click();
	}
	else {
		System.out.println(elementName + "  -----------is Not Displaying");
	}
	}
	catch(Exception e) {
	System.out.println("Exception : "+e);
	}
}
   
public void xpathSendkeys(String xpath,String data,String elementName) {
	try {
		WebElement z=w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	boolean element=z.isDisplayed();
	if(element) {
		z.sendKeys(data);;
	}                                         
	else {
		System.out.println(elementName + "  -----------is Not Displaying");
	}
	}
	catch(Exception e) {
		System.out.println("Exception : "+e);
		}
}


}
