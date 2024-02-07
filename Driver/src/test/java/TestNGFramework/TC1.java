package TestNGFramework;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class TC1{
	WebDriver d;
	Actions act=new Actions(d);
	@BeforeSuite
	public void beforesuite() {
		System.out.println("bd connected successfully");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("db closed successfully");
	}
	
	
	@BeforeTest
	public void beforetest() {
		d=new FirefoxDriver();
		d.get("https://ies-hrms.azurewebsites.net");
	}
	@AfterTest
	public void aftertest() {
	d.quit();
		
	}
/*	
	
	@BeforeClass
	public void beforeclass() {
		d.findElement(By.xpath("//input[@id='UserName']")).sendKeys("admin");
		d.findElement(By.xpath("//input[@id='Password']")).sendKeys("Demo@1234");
		d.findElement(By.xpath("//input[@id='btnLogIn']")).click();
	}
	@AfterClass
	public void afterclass() {
		try {
			d.findElement(By.xpath("//img[@id='optimg']")).click();  
			Thread.sleep(10000);
			WebElement z=d.findElement(By.xpath("//td[text()='Logout']"));
			act.moveToElement(z).click().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	*/
	
@Test
public void tc1() {
	System.out.println("tc1");
}
}
