package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void writingData() throws IOException {
		
      File f = new File("C:\\Users\\91729\\Desktop\\datadriven.xlsx");
		
		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);
		
		//wb.createSheet("Employee_Details").createRow(0).createCell(0).setCellValue("Employee Name");
		
		wb.getSheet("Employee_Details").getRow(0).createCell(1).setCellValue("Employee pass");
		
		
		wb.getSheet("Employee_Details").createRow(1).createCell(0).setCellValue("parthi");
		
		wb.getSheet("Employee_Details").getRow(1).createCell(1).setCellValue("parthi123");
		
        wb.getSheet("Employee_Details").createRow(2).createCell(0).setCellValue("raj");
		
		wb.getSheet("Employee_Details").getRow(2).createCell(1).setCellValue("Raj123");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		//System.exit(0);//skips the below line
		
	     System.out.println("writed sucessfully");
	     
	     wb.close();
	 

	}

	public static void main(String[] args) throws IOException {

		writingData();
	}

}
