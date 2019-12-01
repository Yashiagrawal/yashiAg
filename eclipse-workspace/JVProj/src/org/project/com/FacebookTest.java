package org.project.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookTest {

	
	WebDriver driver;
	@BeforeMethod
	public void Facebook() {
	
		
		System.setProperty("webdriver.chrome.driver", "/home/brickwin/Downloads/SetUp/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}	
		@Test
	public void SignUp() {	
	
	//Enter First Name	
			
			
	String userFirstName = "Sumit";
		
	WebElement FirstName  =	driver.findElement(By.id("u_0_m"));
	FirstName.sendKeys(userFirstName);	
	
	System.out.println("First name is entered = " + userFirstName);
	
	//Enter surname
	
	String userLastName = "Sharma";

	WebElement LstName = driver.findElement(By.name("lastname"));
	LstName.sendKeys(userLastName);
	System.out.println("Last name is entered =" +userLastName);
			
	//Enter Mobile Number and Email 
	
	String Number = "983788876734";
	WebElement Mobile = driver.findElement(By.id("u_0_r"));
	Mobile.sendKeys(Number);
	System.out.println("Mobile Number Is"+Number);
}
		
		
}