package SeleniumTestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailed implements IRetryAnalyzer {

 int counter = 0 ;  int retrylimit = 0 ; 
	
	public boolean retry(ITestResult result )
	{
		if(counter <retrylimit)
		{ 
			counter++ ;
			return true ;
		}
		
		return false ;
		
		
		
		
	}

}
