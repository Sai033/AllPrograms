package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class HRMS {
public static void main(String[] args) throws Exception {
	WebDriver d	=new FirefoxDriver();
	d.get("https://ies-hrms.azurewebsites.net");
	WebElement q=d.findElement(By.id("UserName"));
	q.sendKeys("sdftyu");
	Thread.sleep(3000);
	q.clear();
	Thread.sleep(3000);
	String backgroundColor = q.getCssValue("background-color");
    System.out.println("Background Color: " + backgroundColor);
	Thread.sleep(3000);
	System.out.println("Attribute Text :"+q.getAttribute("id"));
	
	System.out.println("get Tag Name :"+q.getTagName());
	System.out.println("get Location :"+q.getLocation());
	System.out.println("get size :"+q.getSize());
	

	
	System.out.println("get Title :"+d.getTitle());
	System.out.println("get current url :"+d.getCurrentUrl());
	System.out.println("Page source :"+d.getPageSource());
	System.out.println("get Title :"+d.getTitle());
	
}
	
	
	
}
