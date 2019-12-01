package org.project.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01 {
	
	WebDriver driver;
	@Test
	public void testCase01() {
	
		System.setProperty("webdriver.chrome.driver", "/home/brickwin/Downloads/SetUp/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com");
	}

}