package org.mypackage.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	//Upload File Script without using Sikuli
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yashi\\Downloads\\chromedriver_win32new\\chromedriver.exe");
        String baseUrl = "http://demo.guru99.com/test/image_upload/index.php";
        
        	
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();

        driver.get(baseUrl);
   
       
        WebElement uploadElement = driver.findElement( By.id("photoimg"));
        System.out.println("Upload element selected");

     
        
        uploadElement.sendKeys("D:\\Biometric.xlsx");
        System.out.println("Path of the file entered");


//		         
        //driver.close();

	}

}
