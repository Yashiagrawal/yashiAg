package org.mypackage.com;



import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import packageBase.BaseClass;

public class CHeapOAirEXp extends BaseClass{

	@Test
	public void Mytest() throws InterruptedException, IOException {
		
		driver.get("https://www.cheapoair.com");
		System.out.println("WebPage Opened");

	//Select Radio Button	
		
	WebElement Radio = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]"));
	Radio.click();
	System.out.println("One Way Selected");	
		
	//Enter Elements to enter box
	WebElement from = driver.findElement(By.xpath("//input[@placeholder='Enter a city or airport']"));
	from.sendKeys("LAS");
		
	//Explicit Wait
		
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='suggestion-box__list']//li")));
	
	List<WebElement> list = driver.findElements(By.xpath("//ul[@class='suggestion-box__list']//li"));

	System.out.println("Auto Suggest List ::" + list.size());
	
	for(int i = 0 ;i< list.size();i++)
	{
		System.out.println(list.get(i).getText());
		
		if(list.get(i).getText().equals("LAS - Las Vegas All Airports, Nevada, United States"))
		{
			list.get(i).click();
			break;
		}
	}
	
	//To Destination
	WebElement TO = driver.findElement(By.xpath("(//input[@class='form-control pr-4'])[2]"));
	TO.sendKeys("NYC");
	
	//Expicit Wait
	
	WebDriverWait wait2 = new WebDriverWait(driver,30);
	wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ul[@class='suggestion-box__list'])[2]//li")));
	
	
	List<WebElement> list2 = driver.findElements(By.xpath("(//ul[@class='suggestion-box__list'])[2]//li"));
	System.out.println("Auto Suggest List ::"+list2.size());
	
	for(int i = 0 ;i< list2.size();i++)
	{
		System.out.println(list2.get(i).getText());
		
		if(list2.get(i).getText().equals("NYC - New York All Airports, New York, United States"))
		{
			list2.get(i).click();
			break;
		}
	}
	//input[@placeholder='Pick a date']
	
	//Select From Date
	
	((JavascriptExecutor)driver).executeScript("scroll(0, 500)");
	//WebElement datefrom = driver.findElement(By.xpath("//div[@class=' month-date  is--today']"));
	 WebElement date = driver.findElement(By.xpath("//input[@placeholder='Pick a date']"));
    date.sendKeys(Keys.ENTER);
    System.out.println("The Calender to be opened");
    
      WebElement datefrom = driver.findElement(By.xpath(" //a[@class=' month-date date-space is--today']"));
      datefrom.isEnabled();
      Thread.sleep(2000);
      
      datefrom.sendKeys(Keys.ENTER);
      datefrom.sendKeys(Keys.TAB);

      // datefrom.sendKeys(Keys.TAB);
      System.out.println("Date Selected");

	// Select Dropdown
	
	Select travelclass = new Select(driver.findElement(By.name("Class")));
	travelclass.selectByValue("5");
	System.out.println("Travel Class Selected");
			
			
	//SEarch Button Click
			
	WebElement searchnutton = driver.findElement(By.xpath("//input[@type='button']"));
	searchnutton.click();
	System.out.println("Clicked on search button");

	
	//Close the pop up
	
//	WebDriverWait wait3 = new WebDriverWait(driver,500);
//	wait3.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("(//section[@class='exitIntentInner col-xs-12'])[2]")));
//	//wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//section[@class='exitIntentInner col-xs-12'])[2]")));
//	System.out.println("Pop up");
//	
//	WebElement popup= driver.findElement(By.xpath("(//a[@class='phoneFareClose icon ic-cancel-fill'])[2]"));
//	//WebElement popup = driver.findElement(By.xpath("(//section[@class='exitIntentInner col-xs-12'])[2]"));
//	popup.click();
//	System.out.println("Pop up closed");

	//Select the flight
	WebDriverWait wait4 = new WebDriverWait(driver,30);
	wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='cta-1st select__cta']")));
	WebElement Selecttheflight = driver.findElement(By.xpath("//button[@class='cta-1st select__cta']"));
	Selecttheflight.click();
	System.out.println("Select the flight");

	
	WebDriverWait wait5 = new WebDriverWait(driver,30);
    wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='airline__title']")));
    System.out.println("Element to be seen");
	
    //Flight detail of Airlines
    WebElement detail = driver.findElement(By.xpath("//span[@class='airline__title']"));
    System.out.println(detail.getText());
    
    //Flight Source timing
    WebElement srctiming = driver.findElement(By.xpath("//div[@class='trip__time is--depart-source']"));
    System.out.println(srctiming.getText());

    //Flight Destination Timing
    WebElement destiming = driver.findElement(By.xpath("//div[@class='trip__time is--return-source']"));
    System.out.println(destiming.getText());


    //View Flight Deatil
	WebElement flightdetail = driver.findElement(By.xpath("//a[@class='flight-details-link']"));
	flightdetail.click();
    System.out.println("Clicked on Flight Detail");

	
	WebElement fulldetail = driver.findElement(By.xpath("//ul[@class='col-xs-12 pad-top-bottom payment__itinerary-list']"));
	System.out.println(fulldetail.getText());

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,35)");
	//((JavascriptExecutor)driver).executeScript("scroll(0, 35)");

	//TakeScreenshot
	
	TakesScreenshot screenshot = ((TakesScreenshot)driver);
	File src = screenshot.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Screenshots\\travel_detail.png");
	FileUtils.copyFile(src, destination);
	System.out.println("TRavel details with timing and Airline Name");
	
	
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	js1.executeScript("window.scrollBy(35,150)");
	
	
	//View the seat Map
	WebElement viewseatmap = driver.findElement(By.xpath("//button[@type='button']"));
	viewseatmap.click();
	
	JavascriptExecutor js2 = (JavascriptExecutor)driver;
	js2.executeScript("window.scrollBy(150,600)");
	
	
	WebDriverWait wait6 = new WebDriverWait(driver,30);
	wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='passengers-list no-scroll']")));
	System.out.println("Passenger list map found");
	
	
	
	WebElement view = driver.findElement(By.xpath("//ul[@class='passengers-list no-scroll']"));
	view.isDisplayed();
	TakesScreenshot screenshot2 = ((TakesScreenshot)driver);
	File viewmap = screenshot2.getScreenshotAs(OutputType.FILE);
	File destinationmap = new File("C:\\Screenshots\\seat_detail.png");
	FileUtils.copyFile(viewmap, destinationmap);
	System.out.println("Seat Map Screenshot");
	
	//JavascriptExecutor js3 = (JavascriptExecutor)driver;
	JavascriptExecutor js3 = (JavascriptExecutor)driver;
	js3.executeScript("window.scrollBy(600,1000)");
	
	//Price Details
	WebElement PriceDetails = driver.findElement(By.xpath("//article[@class='row payment-block price-detail-block ']"));
	PriceDetails.isDisplayed();
	
	TakesScreenshot screenshot3 = ((TakesScreenshot)driver);
    File pricedetail = screenshot3.getScreenshotAs(OutputType.FILE);
	File DestinationPrice = new File("C:\\Screenshots\\price_detail.png");
	FileUtils.copyFile(pricedetail, DestinationPrice);
	System.out.println("Price Detail Screenshot");

	
	
	
	
	}
}