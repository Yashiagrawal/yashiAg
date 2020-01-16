package org.mypackage.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import packageBase.BaseClass;

public class DownloadFile extends BaseClass{

	@Test
	public void file()
	{
		//Opened Successfully the webPage
		driver.get("http://61.95.220.248:9092/accounts/login/");
		System.out.println("Opened Successfully the webPage");
		
		//Enter Email
		WebElement Email = driver.findElement(By.id("username"));
		Email.sendKeys("sanjay.kumar@crebritech.com");
		System.out.println("Email Entered");
		
		//Enter Password
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("12345678");
		System.out.println("password Entered");
		
		//Click on login button
		//submit_login_btn
		WebElement logBt = driver.findElement(By.id("submit_login_btn"));
		logBt.click();
		System.out.println("clicked on login button");
		
		//click on Bo invoice
		//span[@class='menu-title']
		//WebElement invoiceli = driver.findElement(By.xpath("(//span[@class='menu-title'])[32]"));
		
		WebElement invoiceli = driver.findElement(By.linkText("BO Invoice"));
		invoiceli.click();
		System.out.println("clicked on invoice menu tab");
		
		
		//invoice list
		//BO Invoice List
		WebElement BOinv = driver.findElement(By.linkText("BO Invoice List"));
		BOinv.click();
		System.out.println("clicked on invoice menu");
		
		WebElement download = driver.findElement(By.linkText("Invoice"));
		download.click();
		System.out.println("clicked on download invoice");
		
		
	}
	
}
