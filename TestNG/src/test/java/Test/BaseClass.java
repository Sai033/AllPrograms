package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	static WebDriver d;
	Methods m=new Methods();
	@BeforeTest
	public void driverLaunch() {
		d=m.Browser();
	}
	@BeforeClass
	public void login() {
		d.get("https://smartgig-ess.infionicone.com");
		   m.xpathSendkeys("//input[@id='UserName']", "SG21433", "userName");
		   m.xpathSendkeys("//input[@id='Password']", "Sai@033614", "passowrd");
			m.xpathClick("//input[@id='btnLogIn']", "login");
	}
	
	@BeforeMethod
	public void screenShot() {
		
	}
	
	
	@AfterClass
	public void logout() {
	d.quit();
	
	}
	
	@AfterTest
	public void closeDriver() {
		d.close();
	}
}
