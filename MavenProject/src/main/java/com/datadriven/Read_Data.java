package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
	private static void readParticularData() throws IOException {
		File f = new File("C:\\Users\\91729\\eclipse-workspace\\MavenProject\\User_Name.xlsx\\datadriven.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		Cell cell = row.getCell(1);
		 CellType hkk = cell.getCellType();
		
		if (hkk.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			
		}
		
		else if (hkk.equals(CellType.NUMERIC)) {
			double lkk = cell.getNumericCellValue();
			int data = (int) lkk;
			System.out.println(data);
			
			
		}
		wb.close();
		}

	
		public static void main(String[] args) throws IOException {
			readParticularData();
			
		}

	}
	



