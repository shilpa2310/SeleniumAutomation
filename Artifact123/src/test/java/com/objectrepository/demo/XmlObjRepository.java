package com.objectrepository.demo;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XmlObjRepository {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver"  ,"C://Users//Harshil//Desktop//chromedriver.exe" );
		WebDriver driver = new ChromeDriver () ;
		driver.get("http://demo.guru99.com/test/guru99home/");					
	    driver.manage().window().maximize();
		File file = new File("C:\\Users\\Harshil\\Desktop\\Eclipse\\Artifact123\\testng.xml") ;
		SAXReader reader = new SAXReader() ;
		
		Document document = SAXReader.read(file) ;
		String mobileTesting = document.selectSingleNode("//menu/mobiletesting").getText();							
	    String emailTextBox = document.selectSingleNode("//menu/email").getText();							
	    String signUpButton = document.selectSingleNode("//menu/signup").getText();	
	    
	    
	    driver.findElement(By.xpath(mobileTesting)).click();					
	    driver.navigate().back();	
	    
	    driver.findElement(By.id(emailTextBox)).sendKeys("testguru99@gmail.com");						
	    driver.findElement(By.id(signUpButton)).click();	
		
		
	}

}
