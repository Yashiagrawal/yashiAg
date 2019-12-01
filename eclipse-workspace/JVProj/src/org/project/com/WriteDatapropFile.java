package org.project.com;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class WriteDatapropFile {
	
	@Test
public void writeDataPropFile() throws Exception{
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path is = " + projectPath);
		
		Properties prop = new Properties();

String filePath = projectPath + "//testDataWrite.properties";
		
		FileOutputStream fOut = new FileOutputStream(new File(filePath));
		prop.setProperty("duration","3 months");
		prop.store(fOut, "My Data");
	

}
}