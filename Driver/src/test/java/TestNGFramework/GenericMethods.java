package TestNGFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class GenericMethods {
	  public void takesScreenshot(ITestResult result,WebDriver d) {
		  if(result.getStatus()==ITestResult.FAILURE) {
			  TakesScreenshot ts=(TakesScreenshot)d;
			  File src=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\smart\\Selenium\\TestNG\\src\\test\\resources\\Screenshots\\"+result.getName()+".png");
			 try {
				FileUtils.copyFile(src, dest);
			} catch (IOException e) {
				e.printStackTrace();
			} 
		  }
	}

}
