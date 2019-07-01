package com.objectrepository.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOR 
{

	public static void main(String[] args) throws FileNotFoundException  , IOException, InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C://Users//Harshil//Desktop//chromedriver.exe") ;
	
	WebDriver driver = new ChromeDriver() ;
	driver.get("http://demo.guru99.com/test/guru99home/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
	
	Properties obj = new Properties() ;
	FileInputStream fint = new FileInputStream("C:\\Users\\Harshil\\Desktop\\Eclipse\\Artifact123\\application.properties") ;
	obj.load(fint);
	
	driver.findElement(By.xpath(obj.getProperty("MobileTesting"))).click() ;
	
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.findElement(By.id(obj.getProperty("EmailTextBox"))).sendKeys("testguru99@gmail.com");
	Thread.sleep(3000);
	System.out.print("email entered");
	driver.findElement(By.id(obj.getProperty("SignUpButton"))).click();
	
	}
}


