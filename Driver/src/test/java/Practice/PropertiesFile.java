package Practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFile {
public static void main(String[] args) {
	String url="";
	String username="";
	String password="";
	try {
		FileReader fr=new FileReader("C:\\Users\\smart\\Selenium\\Driver\\src\\test\\resources\\Details.properties");
	    Properties p=new Properties();
	    try {
			p.load(fr);
			url=p.getProperty("url");
		    username=p.getProperty("userName");
			password=p.getProperty("password");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	WebDriver d=new ChromeDriver();
	d.get(url);
	d.findElement(By.xpath("//input[@id='UserName']")).sendKeys(username);
	d.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
	d.findElement(By.xpath("//input[@id='btnLogIn']")).click();
	
}
}
