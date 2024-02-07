package TestNGFramework;


import java.io.FileReader;
import java.util.Properties;

public class Utilities {
public String getData(String data) throws Exception {
	FileReader fr=new FileReader("C:\\Users\\smart\\Selenium\\Driver\\src\\test\\resources\\GlobalProperties.properties");
	Properties p=new Properties();
	p.load(fr);
	String rData=p.getProperty(data);
	return rData;
	
}
public String getLocators(String locatorName) throws Exception {
	FileReader fr=new FileReader("C:\\Users\\smart\\Selenium\\Driver\\src\\test\\resources\\locators.properties");
	Properties p=new Properties();
	p.load(fr);
	String rData=p.getProperty(locatorName);
	return rData;
	
}

}
