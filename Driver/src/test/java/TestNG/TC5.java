package TestNG;

import org.testng.annotations.Test;

public class TC5 {
	@Test(groups= {"Retesting","regression"})
	public void e() {
		System.out.println("Retesting and regression");
	}
}
