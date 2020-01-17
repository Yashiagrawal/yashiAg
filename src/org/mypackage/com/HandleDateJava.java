package org.mypackage.com;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import packageBase.BaseClass;

public class HandleDateJava extends BaseClass{

	@Test
	public void picker() {
		
		
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('datepicker1').value='12/03/2019'");
		System.out.println("Date to be Selected");
	}
	
}
