package Practice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter required brower i,e Chrome,Firefox,Edge");
		String browser=sc.nextLine();
		WebDriver d;
		if(browser.equalsIgnoreCase("chrome")) {
			d=new ChromeDriver();
			d.get("https://ies-hrms.azurewebsites.net");
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			d=new FirefoxDriver();
			d.get("https://ies-hrms.azurewebsites.net");
		}
		else if(browser.equalsIgnoreCase("edge")) {
			d=new EdgeDriver();
			d.get("https://ies-hrms.azurewebsites.net");
		}
	}

}
