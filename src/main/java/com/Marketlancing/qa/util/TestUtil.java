package com.Marketlancing.qa.util;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil {
	XSSFWorkbook wb;
	XSSFSheet sheet;

	public void Generic_dataDriven(String FilePath, String WorkBook) throws IOException
	{
		File filesource = new File(FilePath);
		FileInputStream fileLoad =new FileInputStream(filesource);
		wb= new XSSFWorkbook(fileLoad);
		sheet= wb.getSheet(WorkBook);
	}



}
