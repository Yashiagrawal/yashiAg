package org.mypackage.com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;


import org.testng.annotations.Test;

import packageBase.BaseClass;

public class CookieRead extends BaseClass {
	
	@Test
	public  void cookie()		
    {
    	      
		driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");

       				
        // Input Email id and Password If you are already Register		
        driver.findElement(By.name("username")).sendKeys("yashi@mailinator.com");							
        driver.findElement(By.name("password")).sendKeys("123xyz");							
        driver.findElement(By.name("submit")).click();					
        		
        // create file named Cookies to store Login Information		
        File file = new File("Cookies.data");							
        try		
        {	  
            // Delete old file if exists
			file.delete();		
            file.createNewFile();			
            FileWriter fileWrite = new FileWriter(file);							
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
            // loop for getting the cookie information 		
            	
            // loop for getting the cookie information 		
            for(Cookie ck : driver.manage().getCookies())							
            {			
                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
                Bwrite.newLine();             
            }			
            Bwrite.close();			
            fileWrite.close();	
            
        }
        catch(Exception ex)					
        {		
            ex.printStackTrace();			
        }		
	
    }

}
