package SeleniumTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parmetriazation 
{
	WebDriver driver ;
   @Test(dataProvider = "authenticate")
	public void TLParametreTest(String TLAuthor , String TLsearchKey) throws InterruptedException
   {
		
	
System.out.println("Welcome ->"+TLAuthor+" Your search key is->"+TLsearchKey);


	}
@DataProvider(name = "authenticate")
public Object[][] credentials()
{ 
	return new Object[][]
	
	
	{{"testuser_1", "Test@111" }, { "testuser_2", "Test@222" }};
	
}
}