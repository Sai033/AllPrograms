package Practice;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenFramework {
	public static void main(String[] args) {
		String username="";
		String pwd="";
     try {
		FileInputStream fis=new FileInputStream("C:\\Users\\smart\\Downloads\\hrms.xlsx");
		try {
			Workbook w=WorkbookFactory.create(fis);
			Sheet sh=w.getSheet("Sai");
			DataFormatter df=new DataFormatter();
			username=df.formatCellValue(sh.getRow(0).getCell(1));
			pwd=df.formatCellValue(sh.getRow(1).getCell(1));
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	} catch (Exception e) {
	
		e.printStackTrace();
	}	
	WebDriver d=new ChromeDriver();
	d.get("https://ies-hrms.azurewebsites.net");
	d.findElement(By.xpath("//input[@id='UserName']")).sendKeys(username);
	d.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
	d.findElement(By.xpath("//input[@id='btnLogIn']")).click();
}
}
