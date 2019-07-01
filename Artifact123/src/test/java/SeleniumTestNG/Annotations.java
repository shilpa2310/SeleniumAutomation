package SeleniumTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {


	
    @Test(priority = 1)
	public void testmethod()
	{System.out.println("this is test method ");}
//check

	@Test(priority = 0)
	public void testmethod2() {
		System.out.println("this is second  2nd  test method   ");
	}
	
	@Test(groups = {"Smoke" , "Functional"})
	public void testmethod3() {
		System.out.println("this is 3rd  test method   ");
	}
	
	
	@BeforeClass 
	public void beforeclass()
	{System.out.println("this is beforeclass method ");}
	
	
	/*@BeforeClass
	public void beforeclass2()
	{System.out.println("second 2 beforeclass method");} */
	
	@AfterClass
	public void afterclass()
	{System.out.println("this is afterclass method  ");}
	
	@BeforeSuite
	public void beforeSuite()
	{System.out.println("this is beforesuite method");}
	
	@AfterSuite
	public void afterSuite()
	{System.out.println("this is aftersuite method");}
	
	@BeforeMethod
	public void beforemethod()
	{System.out.println("this is before method");}
	
	@BeforeMethod
	public void Abeforemethod()
	{System.out.println("second  2nd before method");}
	
	
	@AfterMethod
	public void aftermethod()
	{System.out.println("this is after method");}
	
	@BeforeTest
	public void beforeTest()
	{System.out.println("this is before Test");}
	
	@org.testng.annotations.AfterTest
	public void AfterTest()
	{System.out.println("this is After Test");}
	
	
	@BeforeGroups
	public void BeforeGroup()
	{System.out.println("this is Before Group ");}
	
	@AfterGroups
	public void AfterGroup()
	{System.out.println("this is After Group ");}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	