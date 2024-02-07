package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllureReports {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://ies-hrms.azurewebsites.net");
		d.findElement(By.xpath("//input[@id='UserName']")).sendKeys("admin");
		d.findElement(By.xpath("//input[@id='Password']")).sendKeys("Demo@1234");
		d.findElement(By.xpath("//input[@id='btnLazogIn']")).click();
	}

}
