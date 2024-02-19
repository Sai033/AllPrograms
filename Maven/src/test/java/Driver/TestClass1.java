package Driver;
//TestClass1.java

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestClass1 {
	
 public static void main(String[] args) {
	 WebDriver d = DriverUtils.getWebDriver();
	 xpaths x=new xpaths();
   d.get("https://smartgig-ess.infionicone.com");
   x.xpathSendkeys("//input[@id='UserName']", "SG21433", "userName");
   x.xpathSendkeys("//input[@id='Password']", "Sai@033614", "passowrd");
	x.xpathClick("//input[@id='btnLogIn']", "login");
	
  }
}
