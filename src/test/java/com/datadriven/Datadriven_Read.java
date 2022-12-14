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

public class Datadriven_Read {

	public static void readAllData() throws IOException {

		File f = new File("C:\\Users\\TESTUSER\\eclipse-workspace\\maven\\Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(0);
		
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i < physicalNumberOfRows; i++) {
			
			Row row = sheetAt.getRow(i);
			
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < physicalNumberOfCells; j++) {
				
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(CellType.STRING)) {
					
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
				else if (cellType.equals(CellType.NUMERIC)) {
					
					double numericCellValue = cell.getNumericCellValue();
					int num = (int)numericCellValue;;
					System.out.println(num);
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		readAllData();
	}
	
}
