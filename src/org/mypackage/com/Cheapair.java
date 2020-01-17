package org.mypackage.com;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import packageBase.BaseClass;

public class Cheapair extends BaseClass {

	@Test
	public void Test() throws InterruptedException  {
		
		  driver.get("https://www.cheapair.com");
     Thread.sleep(2000);
		//Select Radio button
		//WebElement radio = driver.findElement(By.xpath("//div[@class='trip-type-list clearfix']//input"));
		//WebElement radio = driver.findElement(By.id("tripTypeOW"));
		WebElement radio = driver.findElement(By.xpath("(//label[@class='trip-type'])[2]"));
		//label[@class='trip-type'][2]
		radio.click();
		System.out.println("One Way Selected");
		
		
		
		
		
		
		//Select Radio button
//		clickOn(By.xpath("(//label[@class='trip-type'])[2]"));
//		System.out.println("One Way Selected"); 
//		
		
		//Select From
		WebElement from = driver.findElement(By.id("from1"));
		from.clear();
		from.sendKeys("Mumbai");
//		WebDriverWait wait1 = new WebDriverWait(driver,30);
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content atscitybox']")));
//		
//		List<WebElement> list= driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content atscitybox']"));
//		System.out.println("Auto Suggest List ::" + list.size());
		from.sendKeys(Keys.TAB);
		System.out.println("From Selected");	
	    
		//Select To
		WebElement To = driver.findElement(By.id("to1"));
		To.sendKeys("Delhi");
		Thread.sleep(1000);
		To.sendKeys(Keys.TAB);
		System.out.println("To Selected");

		
		//Select Depart Date ( 20 days after the date enabled or current date)
		WebElement DepartDate = driver.findElement(By.xpath("(//td[@data-handler='selectDay']//a)[20]"));
		Thread.sleep(2000);
		DepartDate.click();
		System.out.println("Depart Date Selected");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,35)");

		

		
		//Click on Button
		WebElement Searchbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		Searchbtn.click();
		System.out.println("Clicked on SEarch Flights");
		Thread.sleep(2000);

        // Switching to Alert       
//      Alert alert = driver.switchTo().alert();		
//       alert.dismiss();
//	System.out.println("alert Dismissed");
//		
		//Find the pop up locator
//		WebElement form = driver.findElement(By.id("signUpForm"));
//		form.getTagName();
		
		
		//Handle Pop Up
		
		Set<String> WindowHandler = driver.getWindowHandles();
		
		System.out.println("Total window open="+WindowHandler.size());
		
		System.out.println("window handler="+WindowHandler);
		
		
		//Insert all values values from window handler set to lsit

		List<String> windowhandles = new ArrayList<String>();
		
		Iterator<String> itr = WindowHandler.iterator();
		
		for(int i =0; i<WindowHandler.size();i++) {
			windowhandles.add(itr.next());
		}
		//Now all values are in a list 
		//close all window except parent
		
		for(int j= windowhandles.size()-1;j>0;j--) {
			
			driver.switchTo().window(windowhandles.get(j));
			System.out.println("Window title after switch to popup is="+driver.getTitle());
			
			
		}
		
		//From above code all pop up are closed
		
		
		driver.switchTo().window(windowhandles.get(0));
		System.out.println("Parent Window ="+driver.getTitle());
		
		driver.close();	

        
        // Switching to Alert       
//   WebElement SignupWindow = driver.findElement(By.xpath("//form[@id='signUpForm']"));
//   SignupWindow.getText();
//   System.out.println("alertMessage");	
 
// Switching to Alert        
   Alert alert = driver.switchTo().alert();
   
   //Capturing Alert Message

   String alertMessage = driver.switchTo().alert().getText();
   
   System.out.println(alertMessage);	
   Thread.sleep(5000);
	
   // Accepting alert		
   alert.accept();	

   
 
		
		
}
}


