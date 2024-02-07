package TestNG;

import org.testng.annotations.Test;

public class TC2 {
	@Test(groups= {"Regression"})
	public void b() {
		System.out.println("Regression");
	}
}
