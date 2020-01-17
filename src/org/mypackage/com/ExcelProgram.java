package org.mypackage.com;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelProgram {
	
	
	//Excel Program to read data 
	public static void main(String[] args) throws Exception {
		
		String ProjectPath = System.getProperty("user.dir");
		String excelPath = ProjectPath + "\\ReadExcel.xlsx";
//		
		File file = new File(excelPath);
		
	//System.out.println("Excel Path is +"+excelPath);
		
		//File fp = new File("D:\\EXcel data\\ReadExcel.xls");
		//File fp = new File("D:\\EXcel data\\ReadExcel.xlsx");
		
		System.out.println("excelPath="+excelPath);
		FileInputStream fip = new FileInputStream(file);
		
		XSSFWorkbook workbook1 = new XSSFWorkbook(fip);
		XSSFSheet sheet = workbook1.getSheetAt(0);
		
		//sheet.getRow(0).createCell(2).setCellValue("Pass");
		//sheet.getRow(1).createCell(2).setCellValue("Fail");
		int rowscount = sheet.getLastRowNum() + 1;
		System.out.println("Total Rows Count =" +rowscount);
		
		
		int columncount = sheet.getRow(0).getLastCellNum()+ 1;
		System.out.println("Total Columns Count =" +columncount);
		
		String data = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		
		String data1 = sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data1);
		workbook1.close();
		
}
}
