package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Alldata {
	
	public static void readalldata() throws IOException {
		
		File f = new File(".//User_Name.xlsx\\datadriven.xlsx");
		
		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);
		
	 Sheet sat = wb.getSheetAt(0);
	 
	 int pnr = sat.getPhysicalNumberOfRows();
	 
	 for (int i = 0; i < pnr; i++) {
		 
		 Row row = sat.getRow(i);
		 
		 int pnc = row.getPhysicalNumberOfCells();
		 
		 for (int j = 0; j < pnc; j++) {
			 
			 Cell cell = row.getCell(j);
			 
			 CellType cellType = cell.getCellType();
			 
			 if (cellType.equals(cellType.STRING)) {
				 
				 String stringCellValue = cell.getStringCellValue();
				 
				 System.out.println(stringCellValue);
				 
				
			}
			 
			 else if (cellType.equals(CellType.NUMERIC)) {
				 
				 double ncv = cell.getNumericCellValue();
				 
				 int data = (int) ncv;
				 
				 System.out.println(data);
				
			}
			
		}
		
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}

	public static void main(String[] args) throws IOException {
		
		readalldata();

	}

}
