package org.mypackage.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import packageBase.BaseClass;

public class ExplicitDatePicker extends BaseClass {
	
	@Test
	public void datepickeranexplicitWait() throws InterruptedException, IOException{
		
		
		  driver.get("https://www.cheapoair.com");

		//scrolling browser
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,1000)");
		  
		  ((JavascriptExecutor)driver).executeScript("scroll(0, 5000)");
		  Thread.sleep(5000);
		  //Vice-Versa
		  ((JavascriptExecutor)driver).executeScript("scroll(5000, 0)");


		
		  //Enter Origin 
		  String origincity = "LAS"; 
		  WebElement origin = driver.findElement(By.xpath("//input[@placeholder='Enter a city or airport']")); 
		  //origin.clear(); 
		 //origin.sendKeys("LEARN");
		  //Thread.sleep(500);
		  origin.sendKeys(origincity);
		  //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			origin.sendKeys(Keys.ENTER);
		  
		  
		//Wait- Explicit wait
	    //WebDriverWait explicit = new WebDriverWait(driver,500);
		//explicit.until(ExpectedConditions.attributeContains(By.xpath("//li[@class='suggestion-box__item ic-location is--focused selected']"), "class","visible"));
		
		  
		 
		/*
		 * //Take screenshot TakesScreenshot screenshot12= (TakesScreenshot)driver; File
		 * src= screenshot12.getScreenshotAs(OutputType.FILE); //File destScreenshot12 =
		 * new File("C:\\abc2.jpeg"); FileUtils.copyFile(src, new
		 * File("C:\\Screenshots\\abc2.jpeg"));
		 * System.out.println("Screenshot clicked");
		 */	  
			
			//Thread.sleep(500);
			//origin.sendKeys(Keys.TAB);
			/*
		 * 
		 * 
		 * 
		 * // FluentWait
		 * 
		 * Boolean suggestionBoxDisplay = explicit.until(newFunction<WebDriver,
		 * Boolean>(){
		 * 
		 * @Override public Boolean apply(WebDriver driver) { String
		 * SuggestionBoxClasValue=
		 * driver.findElement(By.xpath("//section[@class='suggestion-box']/div")).
		 * getAttribute("class");
		 * System.out.println("Suggestion box displayed"+SuggestionBoxClasValue);
		 * if(SuggestionBoxClasValue.contains("visible")) { return true; } else { return
		 * false; } //return null } });
		 * 
		 * if(suggestionBoxDisplay) { System.out.println("Suggestion box is displayed");
		 * } else { throw new RuntimeException("Suggestion box is not dispalyed"); }
		 * 
		 */
	/*	
		// Enter Destination
		String destCity = "NYC";
		explicit.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='form-control pr-4'])[2]")));
		WebElement destination = driver.findElement(By.xpath("(//input[@class='form-control pr-4'])[2]"));
		destination.clear();
		destination.sendKeys(destCity);
		System.out.println("Destination is enetered" + destCity);
		destination.sendKeys(Keys.TAB);

		// Select Date
		//String startXp = "//div[@class='cal-date is--today']/div[3]/div[";
		String startXp = "//td[@class='cal-date is--today']";
		//int i = 22;
		//String endXp = "]/div";

		//String xpathDates = startXp + i + endXp;
		String xpathDates = startXp;
		try {
			String calDatewithFare = driver.findElement(By.xpath("xpathDates")).getText();
			String calDate = calDatewithFare.split("\n")[0];
			System.out.println(calDate);
			if (calDate.equals("21")) {
				driver.findElement(By.xpath(xpathDates)).click();
			}
		}

		catch (Exception ex) {
			System.out.println("Date is not available in for xpath =" + xpathDates);
		}*/
	}


}
