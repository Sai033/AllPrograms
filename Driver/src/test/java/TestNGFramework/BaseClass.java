package TestNGFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class BaseClass {
	WebDriver d;
	Utilities u=new Utilities();
	Actions act=new Actions(d);
	GenericMethods g=new GenericMethods();
@BeforeSuite
public void DbConnection() {
	System.out.println("DB connection");
}
@BeforeClass
public void LaunchingBrowser() throws Exception {
	d=new FirefoxDriver();
	d.get(u.getData("url"));
	
}

@BeforeMethod
public void login() {
	try {
		d.findElement(By.xpath(u.getLocators("username"))).sendKeys(u.getData("username"));
		d.findElement(By.xpath(u.getLocators("password"))).sendKeys(u.getData("password"));
		d.findElement(By.xpath(u.getLocators("submit"))).click();
	} catch (Exception e) { 
		e.printStackTrace();
	}
}



@AfterMethod
	 public void takesScreenshot(ITestResult result) {
		  if(result.getStatus()==ITestResult.FAILURE) {
			  TakesScreenshot ts=(TakesScreenshot)d;
			  File src=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\smart\\Selenium\\Driver\\src\\test\\resources\\Screenshots\\"+result.getName()+".png");
			 try {
				FileUtils.copyFile(src, dest);
			} catch (IOException e) {
				e.printStackTrace();
			} 
		  }
	
  try {
	d.findElement(By.xpath(u.getLocators("menuIcon"))).click();  
	Thread.sleep(10000);
	WebElement z=d.findElement(By.xpath(u.getLocators("logoutbtn")));
	act.moveToElement(z).click().perform();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
}

@AfterClass
public void browserClose() {
	d.close();
}



@AfterSuite
public void DbClose() {
System.out.println("DB close");	
}

}
