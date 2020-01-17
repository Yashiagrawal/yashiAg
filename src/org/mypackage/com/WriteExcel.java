package org.mypackage.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	
	
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
			
			XSSFWorkbook workbook = new XSSFWorkbook(fip);
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			sheet.getRow(0).createCell(2).setCellValue("Pass");
			sheet.getRow(1).createCell(2).setCellValue("Fail");
			
			sheet.getRow(2).createCell(2).setCellValue("Pass");
			sheet.getRow(3).createCell(2).setCellValue("Fail");
			
			
			FileOutputStream fout = new FileOutputStream(file);
			workbook.write(fout);
			workbook.close();;
		
	    

		}

	
	
	
	
	

}
