package com.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelldataprovider {
	
	
	
	
	
	
	
	XSSFWorkbook wb;
	public Excelldataprovider() throws IOException {
	
	
	
	String pathexcel="C:/Users/PRIYAL/eclipse-workspace/maven1/Testdata/data.xlsx";
	FileInputStream fis1=new FileInputStream(pathexcel);
	
	
	wb=new XSSFWorkbook(fis1);
}

	
	public String getStringData(String sheetname,int row,int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	
	
}
