package com.datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWriteExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadWriteExcel obj = new ReadWriteExcel();
		String un = obj.ReadExcel("Sheet1", 1, 0);
		System.out.println("User: " + un);
		String pw = obj.ReadExcel("Sheet1", 1, 1);
		System.out.println("Password: " + pw);
		
		obj.WriteExcel("Sheet1", 1, 2, "Pass");
	}
	public String ReadExcel(String sheetName, int rNum, int cNum) {
		String data = "";
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\vrddam\\Desktop\\ATLAS\\6 Testing\\JavaDemoSheet.xlsx");  
			Workbook workbook = WorkbookFactory.create(fin);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rNum);
			Cell cell = row.getCell(cNum);
			data = cell.getStringCellValue();
		} catch (Exception e) {
			System.out.println(e);
		}
		return data;
	}
	public void WriteExcel(String sheetName, int rNum, int cNum, String data) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\vrddam\\Desktop\\ATLAS\\6 Testing\\JavaDemoSheet.xlsx");  
			Workbook workbook = WorkbookFactory.create(fin);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rNum);
			Cell cell = row.createCell(cNum);
			cell.setCellValue(data);
			FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\vrddam\\\\Desktop\\\\ATLAS\\\\6 Testing\\\\JavaDemoSheet.xlsx");
			workbook.write(fos);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
