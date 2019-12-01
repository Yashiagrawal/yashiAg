package org.project.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class ReadDataXls {

	@Test
	public void projectP() throws IOException{
		
		String ProjectPath = System.getProperty("user.dir");
		System.out.println("Excel Path is"+ProjectPath);
		
		String excelPath = ProjectPath + "//Tesdata.xlsx";
		System.out.println("Excel Path is"+excelPath);

		
		
	File file=new File(excelPath);
	FileInputStream fip=new FileInputStream(file);
	
	XSSFWorkbook workbook=new XSSFWorkbook(fip);
	XSSFSheet sheet=workbook.getSheetAt(0);
	
		//Get rows count
		String rowsName = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Total rows are = " +rowsName);
				
		String colName = sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Total columns are = " +colName);
				
		

	workbook.close();
	

		
	}
	}
