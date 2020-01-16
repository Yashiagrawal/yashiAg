package org.mypackage.com;

import org.openqa.selenium.By;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import packageBase.BaseClass;

public class Sikuli extends BaseClass {
	
	@Test
	public void mycode() throws FindFailed, InterruptedException   {
		
		 driver.get("http://demo.guru99.com/test/image_upload/index.php");
		 
		
		 
		// Click on Browse button and handle windows pop up using Sikuli
	   // driver.findElement(By.xpath(".//*[@id='photoimg']")).click();
	        
	      driver.findElement(By.id("imageform")).click();
	        //choose.click();
	        System.out.println("Chosed the file");
	        
	        
	        String filepath = "D:\\Guru99\\Files\\";
	      //String inputFilePath = "D:\\Guru99\\Files\\";
	        
	       // D:\Guru99\Files\FileTextBox.PNG
	        
	    Pattern fileInputTextBox = new Pattern(filepath + "FileTextBox.PNG");
	      //  Pattern fileInputTextBox = new Pattern("D:\\Guru99\\Files\\FileTextBox.PNG");
	        //Pattern openButton = new Pattern("D:\\Guru99\\Files\\OpenButton.PNG");
	        Pattern openButton = new Pattern(filepath + "OpenButton.PNG");  
	        Screen s = new Screen();
	        Thread.sleep(300);
	       // s.type(fileInputTextBox,  "D:\\Guru99Demo\\Files\\Test.docx");
	        //s.click(fileInputTextBox);
	        //s.type(fileInputTextBox,"D:\\Guru99\\Files\\erp1.docx");
	      s.type(fileInputTextBox,"D:\\Guru99\\Files\\erp1.docx");
	      s.click(openButton);
	      System.out.println("The sikuli image interaction completed");
		 
		
	}

}
