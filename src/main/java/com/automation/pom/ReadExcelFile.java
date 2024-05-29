package com.automation.pom;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public ReadExcelFile() {
		// TODO Auto-generated constructor stub
	}
	
	public void readExcel(String filepath, String sheetName) throws IOException{
		File file = new File(filepath);
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook newWorkBook = new XSSFWorkbook(inputStream);
		XSSFSheet newSheet = newWorkBook.getSheet(sheetName);
		int rowCount = newSheet.getLastRowNum() + newSheet.getFirstRowNum();
		
		for (int i = 0; i < rowCount; i++) {
			XSSFRow row = newSheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				System.out.println(row.getCell(j).getStringCellValue()+ "!!");
			}
		}
		newWorkBook.close();
	}
	
	public String getCellValue(String filepath, String sheetName, int rowNumber, int cellNumber) throws IOException{
			
		File file = new File(filepath);
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook newWorkBook = new XSSFWorkbook(inputStream);
		
		XSSFSheet newSheet = newWorkBook.getSheet(sheetName);
		XSSFRow row = newSheet.getRow(rowNumber);
		
		XSSFCell cell = row.getCell(cellNumber);
		newWorkBook.close();
		
		return cell.getStringCellValue();
	}
	
	public String getCellValueInt(String filepath, String sheetName, int rowNumber, int cellNumber) throws IOException{
		
		File file = new File(filepath);
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook newWorkBook = new XSSFWorkbook(inputStream);
		
		XSSFSheet newSheet = newWorkBook.getSheet(sheetName);
		XSSFRow row = newSheet.getRow(rowNumber);
		
		XSSFCell cell = row.getCell(cellNumber);
		
		DataFormatter formatter = new DataFormatter();
		String val = formatter.formatCellValue(cell);
		newWorkBook.close();
		return val;
	}
	public int getLastRowNumber(String filepath, String sheetName) throws IOException {
		File file = new File(filepath);
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook newWorkBook = new XSSFWorkbook(inputStream);
		XSSFSheet newSheet = newWorkBook.getSheet(sheetName);
		newWorkBook.close();
		return newSheet.getLastRowNum();	
	}
	
	
}
