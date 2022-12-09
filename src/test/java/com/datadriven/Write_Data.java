package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static void writeData() throws IOException {

		File f = new File("C:\\Users\\TESTUSER\\eclipse-workspace\\maven\\Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);

		Sheet createSheet = w.createSheet("Marks1");
		
		Row createRow = createSheet.createRow(0);
		
		Cell createCell = createRow.createCell(0);
		
		createCell.setCellValue("Name");
		
		w.getSheet("Marks1").getRow(0).createCell(1).setCellValue("marks");
		
		w.getSheet("Marks1").getRow(0).createCell(2).setCellValue("percentage");
		
		w.getSheet("Marks1").createRow(1).createCell(0).setCellValue("Vanitha");

		w.getSheet("Marks1").getRow(1).createCell(1).setCellValue(100);
		
		w.getSheet("Marks1").getRow(1).createCell(2).setCellValue("100");
		
		w.getSheet("Marks1").createRow(2).createCell(0).setCellValue("pavi");
		
		w.getSheet("Marks1").getRow(2).createCell(1).setCellValue(99);

		w.getSheet("Marks1").getRow(2).createCell(2).setCellValue("99");
	
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		
	}
	public static void main(String[] args) throws IOException {
		writeData();
	}

}

