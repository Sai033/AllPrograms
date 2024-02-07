package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Driver {
public WebDriver d;
public Driver(WebDriver d) {
	this.d=d;
	PageFactory.initElements(d, this);
}
}
