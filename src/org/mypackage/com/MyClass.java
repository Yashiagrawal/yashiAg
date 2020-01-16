package org.mypackage.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import packageBase.BaseClass;

public class MyClass extends BaseClass {
	
	@Test
	 public void MYtest() throws InterruptedException, IOException {

		 driver.get("https://www.cheapoair.com");


	   //Radio One Way Trip Selected
	   Thread.sleep(1000);
		//WebElement Radioonew = driver.findElement(By.xpath("//*[@name='ONEWAYTRIP']"));
		//WebElement Radioonew = driver.findElement(By.xpath("//(label[@class='custom-control-label'])[2]"));
		WebElement Radioonew = driver.findElement(By.xpath("//label[@for='onewayTrip']"));
		
	    Radioonew.click();
		System.out.println("Radio Button Selected");


          // FROM ORIGIN

         // WebElement from = driver.findElement(By.xpath("//input[@placeholder='Enter a city or airport']"));
          WebElement from = driver.findElement(By.xpath("//input[@placeholder='Enter a city or airport']"));
          from.sendKeys("LAS");

          /*

          * // Wait to load suggestion list WebDriverWait explicit = new

          * WebDriverWait(driver, 500);

          * explicit.until(ExpectedConditions.attributeContains(By.xpath(

          * "//section[@class='suggestion-box']"),"class","visible"));

          * from.sendKeys(Keys.ENTER);

          */

          Thread.sleep(2000);
          from.sendKeys(Keys.TAB);
          System.out.println("Origin Selected");

          // TO Destination

          WebElement TO = driver.findElement(By.xpath("(//input[@class='form-control pr-4'])[2]"));
          TO.sendKeys("NYC");
          // TO.sendKeys(Keys.ENTER);
          Thread.sleep(2000);
          TO.sendKeys(Keys.TAB);
          System.out.println("Destination Selected");

          // FROM Date Selected
        
        ((JavascriptExecutor)driver).executeScript("scroll(0, 500)");
        WebElement date = driver.findElement(By.xpath("//input[@placeholder='Pick a date']"));
        date.sendKeys(Keys.ENTER);
        System.out.println("The Calender to be opened");
        
          WebElement datefrom = driver.findElement(By.xpath(" //a[@class=' month-date date-space is--today']"));
          datefrom.isEnabled();
          Thread.sleep(2000);
          
          datefrom.click();
          // datefrom.sendKeys(Keys.TAB);
          System.out.println("Date Selected");

          /*

          * // Click on next button WebElement next =

          * driver.findElement(By.id("sv_arwr")); next.sendKeys(Keys.ENTER);

          */// To Date Selected

//          ((JavascriptExecutor)driver).executeScript("scroll(0, 500)");
//          WebElement dateto = driver.findElement(By.xpath("(//div[@data-date=5])[2]"));
//          Thread.sleep(2000);
//          dateto.click();
//          System.out.println("return Date Selected");

          // dateto.getAttribute("data-date").valueOf("5");

          //dateto.sendKeys(Keys.ENTER);

          //System.out.println("Date Again Selected");

         

          //Select Dropdown 
          Select travelclass = new Select(driver.findElement(By.name("Class"))); 
          travelclass.selectByValue("5");
         System.out.println("Travel Class Selected");

             // SEarch Button Click

          WebElement searchnutton = driver.findElement(By.xpath("//input[@type='button']"));
          searchnutton.click();
          System.out.println("Clicked on search button");

 // Wait for loading page
          
          Thread.sleep(2000);
          
          // Close Pop up
          
          //Click on Select Button when Enabled if flight Enabled
          
          WebElement SelectButton = driver.findElement(By.xpath("(//button[@class='cta-1st select__cta'])[1]"));
          SelectButton.isEnabled();
          if(driver.findElement(By.xpath("(//button[@class='cta-1st select__cta'])[1]")).isEnabled())
          {
        	  driver.findElement(By.xpath("(//button[@class='cta-1st select__cta'])[1]")).click();
              System.out.println("Select the flight");
          }
          else {
          System.out.println("Select the not flight");
          }    
          
          //Thread.sleep(2000);
          
//          //Take screenshot 
//          driver.findElement(By.xpath("(//button[@class='cta-1st select__cta'])[1]")).getScreenshotAs(OutputType.FILE);
//          //TakesScreenshot screenshot12= ((TakesScreenshot)driver); 
//          File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//          File dest = new File("C:\\abc.jpeg"); 
//   		 FileUtils.copyFile(src, dest);
//   		 System.out.println("Screenshot clicked");
//   		  
//   			
	 }

}
