package Practice;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageHandling {
	public static void main(String[] args) throws Exception {
		WebDriver d=new ChromeDriver();
		d.get("https://imgbb.com/");
		Thread.sleep(5000);
		WebElement z=d.findElement(By.xpath("//a[text()='Start uploading']"));//.sendKeys("C:\\Users\\smart\\Pictures\\Screenshots\\Screenshot 2024-01-22 101901.png");
		z.click();
		Robot r=new Robot();
		r.delay(2000);
		StringSelection ss=new StringSelection("C:\\Users\\smart\\Pictures\\Screenshots\\Screenshot 2023-12-07 170320.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.delay(2000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.delay(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("frdsc");
	
		
	}

}
