package org.project.com;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataPropFile {

	@Test
	public void readData() throws Exception{
		
		String ProjectPath = System.getProperty("user.dir");
		System.out.println("Project Path is"+ProjectPath);
		
		Properties prop = new Properties();
		
		String filePath = ProjectPath + "//testData.properties";
		
		
	File file = new File(filePath);
	FileInputStream fip = new FileInputStream(file);
	
	prop.load(fip);
	
	String address = prop.getProperty("adds");
	System.out.println(address);
		
}
}