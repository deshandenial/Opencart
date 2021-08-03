package com.qa.opencart.util;


import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.*;



public class ReadExcel {
	
	public static String[][] readData(String filename,String sheetName) throws IOException {
	{
		String fileLocation = ("./src/test/resources/testData/"+filename+".xlsx"); 
		FileInputStream ip = new FileInputStream(fileLocation);
		XSSFWorkbook wbook=new XSSFWorkbook(ip);
		XSSFSheet sheet = wbook.getSheet(sheetName);
		int lastRowNum = sheet.getLastRowNum();
		int getPhysicalRows = sheet.getPhysicalNumberOfRows();
		System.out.println("print lastRowNum :" + lastRowNum);
		System.out.println("print PhysicalRowNum :" + getPhysicalRows);
		
		int lastCellNum =sheet.getRow(0).getLastCellNum();
		System.out.println("print lastCellNum :" + lastCellNum);
		
		String[][] data =new String[lastRowNum][lastCellNum];
		
		for (int i = 1; i <= lastRowNum; i++) 
		{
			for (int j = 0; j < lastCellNum; j++) {
				
				String value=sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=value;
				System.out.println(value);
			} 
			
		}
		return data;

	}

	
	}
}
