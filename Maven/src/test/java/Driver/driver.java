package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class driver {
	
        WebDriver d;
		public driver(WebDriver d) {
			this.d=d;
			PageFactory.initElements(d,this);
		}
		public void launch() {
			d=new ChromeDriver();
		}
	}

