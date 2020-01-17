package org.mypackage.com;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;



public class propFile {
      @Test    
  public void readData() throws IOException  {       
	
	 String projectPath = System.getProperty("user.dir");        
	 System.out.println("Project Path is ="+projectPath);
	 
	Properties prop = new Properties();
	String FilePath = projectPath + "\\MyProp.properties";
	
	File file = new File(FilePath);
	FileInputStream fip = new FileInputStream(file);
	
	prop.load(fip);
	
	String address = prop.getProperty("Url");
	System.out.println(address);
	
	
    	
	
	
	
	
		  	  }

	
}
