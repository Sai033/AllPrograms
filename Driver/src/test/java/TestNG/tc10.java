package TestNG;

import org.testng.annotations.*;

public class tc10 {
	
  @BeforeSuite
   public void suite() {
	   System.out.println("BeforeSuite");
   }
   @AfterSuite
   public void AterSuite() {
	   System.out.println("AterSuite");
   }

   
   @BeforeClass
   public void Beforeclass() {
	   System.out.println("Beforeclass");
   }
   @AfterClass
   public void Afterclass() {
	   System.out.println("Afterclass");
   }
   
   
   @BeforeMethod
   public void BeforeMethod() {
	   System.out.println("BeforeMethod");
   }
   @AfterMethod
   public void AfterMethod() {
	   System.out.println("AfterMethod");
   }
   
   @BeforeTest
   public void BeforeTest() {
	   System.out.println("BeforeTest");
   }
   @AfterTest
   public void AfterTest() {
	   System.out.println("AfterTest");
   }
  
    
   @Test
   public void test() {
	   System.out.println("test");
   }
  
	
	}	
	

