package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
static WebDriver d;

public static void main(String[] args) {
	Driver dr=new Driver(d);
	d=new ChromeDriver();
	Methods m=new Methods();
	webElements e=new webElements();
	d.get("https://ies-hrms.azurewebsites.net");
	m.SendelementFound(e.username, "admin");
	
	
}
}
