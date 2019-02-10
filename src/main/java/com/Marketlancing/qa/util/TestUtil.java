package com.Marketlancing.qa.util;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	String FilePath ="C:\\Users\\HP\\git\\MarketLancing\\src\\main\\java\\com\\Marketlancing\\qa\\testData\\MarketLancing login data.xlsx";

	public Object[][] Generic_dataDriven(String WorkBook) throws IOException
	{
		File filesource = new File(FilePath);
		FileInputStream fileLoad =new FileInputStream(filesource);
		wb= new XSSFWorkbook(fileLoad);
		sheet= wb.getSheet(WorkBook);

		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		System.out.println(sheet.getRow(0).getLastCellNum());

		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
			{
				data[i][k]=sheet.getRow(i+1).getCell(k).getStringCellValue();		
			}
		}
		
		return data;



	}
}
