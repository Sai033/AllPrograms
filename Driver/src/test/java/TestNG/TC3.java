package TestNG;

import org.testng.annotations.Test;

public class TC3 {
	@Test(groups= {"Smoke"})
	public void c() {
		System.out.println("Smoke");
	}
}
