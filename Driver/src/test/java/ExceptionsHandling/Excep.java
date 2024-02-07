package ExceptionsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excep {
	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.get("https://ies-hrms.azurewebsites.net/"); 
		try {
		d.findElement(By.id("UserName")).sendKeys("admin");
	}
		catch (Exception n) {
			System.out.println("x path not available");
		}
		try {
		d.findElement(By.id("Password")).sendKeys("Demo@1234");
	}
		catch (Exception n) {
			System.out.println("x path not available");
		}
		try {
		d.findElement(By.id("btnLogIn")).click();
	}
		catch (Exception n) {
			System.out.println(n+ "x path not available");
		}
		
		d.findElement(By.xpath("//select[@id='WorkFlowId']")).click();
	}
}








