package SeleniumTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@Test
	public void testmethodclass2() {

		System.out.println("testmethod 2");

	}

	@BeforeMethod
	public void openBrowserclass2() {
		System.out.println("beforemethod 2");
	}

	@AfterMethod
	public void closebrowserclass2() {
		System.out.println("aftermethod 2");

	}
	
	
	
	
	
	

}
