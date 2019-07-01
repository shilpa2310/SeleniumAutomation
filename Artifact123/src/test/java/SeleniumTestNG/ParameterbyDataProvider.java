package SeleniumTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ParameterbyDataProvider {
WebDriver driver ;
	@Test
	 public void Softassert ()
	 {
		System.out.println(  "this is softassert method " ) ;
		SoftAssert softassert1 = new SoftAssert();
		softassert1.assertTrue(false , " the condition is false " ) ;
	
	 }
	 @Test(retryAnalyzer = SeleniumTestNG.RetryFailed.class)
	  public void HardAssert() {
	 System.out.println("this is method for hard assert ");
	Assert.assertEquals("shilpa " , "harshil" , " these are not equal co they are diferent ");
System.out.println("this is hard method execution ");
}
	 
	 }
	 