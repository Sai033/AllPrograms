package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launching {
	static WebDriver d;
 
  public static void main(String[] args) {
	 
	  methods m=new methods();
	  System.out.println("a");
	 driver dr=new driver(d);
	 dr.launch();
	System.out.println("b");
	d.get("https://smartgig-ess.infionicone.com");
	System.out.println("c");
	m.xpath();
    System.out.println("d");
  }
}
