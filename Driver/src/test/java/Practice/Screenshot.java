package Practice;


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Screenshot {
	WebDriver d;
	@Test
	public void screenshotds() {
		d=new ChromeDriver();
		d.get("https://ies-hrms.azurewebsites.net");
		d.findElement(By.xpath("//input[@id='UserName']")).sendKeys("admin");
		d.findElement(By.xpath("//input[@id='Password']")).sendKeys("Demo@1234");
		d.findElement(By.xpath("//input[@id='btnLazogIn']")).click();
	}
	@AfterMethod
	public void screenshotMethod(ITestResult result) throws IOException {
		if(result.getThrowable() instanceof NoSuchElementException) {
		}
		else {
			captureScreenshot(result.getName());
			System.out.println("Name is:"+result.getName());
		}
	}
	public void captureScreenshot(String Name) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)d;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\smart\\Selenium\\Driver\\Screenshot\\"+Name+".png");
		FileUtils.copyFile(src,dest);
		
	}

}
