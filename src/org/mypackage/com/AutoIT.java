package org.mypackage.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import packageBase.BaseClass;

public class AutoIT extends BaseClass{
	
	@Test
	public void FileUpload() throws IOException {
		
		//Enter Url and Open Page
		 driver.get("http://demo.guru99.com/test/image_upload/index.php");
		 
		 
		 //Find the locator
		 driver.findElement(By.id("imageform")).click();
		 
		 //below line execute the AutoIT script
		 
		 Runtime.getRuntime().exec("D:\\FileUpload.exe");
		 System.out.println("The Auto IT Script execute sucessfully");
		 
		
	}

}
