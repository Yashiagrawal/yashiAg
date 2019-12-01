package org.project.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	
	WebDriver driver;

	@BeforeTest
	public void mainE() {
		System.setProperty("webdriver.chrome.driver", "/home/brickwin/Downloads/SetUp/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
}
	
	
	@AfterMethod
	
	public void Miane() {
		
		
		driver.close();
}
	
}