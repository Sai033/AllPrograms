package TestNG;

import org.testng.annotations.Test;

public class TC1 {

	@Test(groups= {"Retesting"})
	public void a() {
		System.out.println("Retesting");
	}
	
	
}
