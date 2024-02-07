package TestNG;

import org.testng.annotations.Test;

public class TC6 {
	@Test(groups= {"Retesting","sanity","moke"})
	public void f() {
		System.out.println("Retesting,sanity,moke");
	}
}
