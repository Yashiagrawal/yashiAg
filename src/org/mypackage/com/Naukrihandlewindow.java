package org.mypackage.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import packageBase.BaseClass;

public class Naukrihandlewindow extends BaseClass{

     @Test
	public void closenaukripopups() throws Exception {
	
		driver.get("http://www.naukri.com");
		Thread.sleep(2000);
	
	
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
	
	for(int j = windowhandles.size()-1;j>0;j--) {
		
		driver.switchTo().window(windowhandles.get(j));
		System.out.println("Window title after switch to popup is="+driver.getTitle());
		driver.close();	
		
	}
	
	//From above code all pop up are closed
	
	
	driver.switchTo().window(windowhandles.get(0));
	System.out.println("Parent Window ="+driver.getTitle());

	//Click on skills option and enter skills

	WebElement id = driver.findElement(By.id("qsbClick"));
	id.click();
	System.out.println("Skills to entered");
	
	WebElement Keyword = driver.findElement(By.name("qp"));
	Keyword.sendKeys("Java");
	Keyword.sendKeys(Keys.TAB);
	System.out.println("Java Skill  entered");

	//Click on location option and enter location
	WebElement location = driver.findElement(By.name("ql"));
	location.sendKeys("Delhi");
	System.out.println("Type Location = "+location);

	//Tab key pressed
	location.sendKeys(Keys.TAB);
	System.out.println("Tab Key Pressed");

	
	
	//Select Experience
	
	WebElement Exp = driver.findElement(By.xpath("//input[@placeholder='Experience']"));
	for(int i=0; i<=3; i++) {
	Exp.sendKeys(Keys.ARROW_DOWN);
	System.out.println("Experience Selected");
	}
	Exp.sendKeys(Keys.TAB);
	
	
	//Select Salary
	WebElement Salary = driver.findElement(By.xpath("//input[@placeholder='Salary']"));
	for(int i=0; i<=6; i++) {
	Salary.sendKeys(Keys.ARROW_DOWN);
	System.out.println("Salary Selected");
	
	}
	
	//Click on serach button
	WebElement button = driver.findElement(By.xpath("//button[@id='qsbFormBtn']"));
	button.click();
	System.out.println("Search button clicked");

	//Wait
	WebDriverWait wait = new WebDriverWait(driver,30);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='small_title']//span")));
	
    //Getting the text of search jobs
    WebElement titlejob = driver.findElement(By.xpath("//div[@class='small_title']//span"));
    System.out.println("Title job Search "+titlejob.getText());
}	
	
}
