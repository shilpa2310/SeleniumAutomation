package SeleniumTestNG;

import org.testng.annotations.Test;

public class TestNGException {

	@Test(expectedExceptions = NullPointerException.class)
	public void 	Testexception()
	{
		System.out.println("this is exception block");
		
		int i = 1/0 ;
	}
	
	
	
	
	
}
