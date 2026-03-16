package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import ConstantsData.ConstantsData;

public class FetchDataFromExcel {
	
	public static String getDataFromExcel(int x,int y) throws IOException
	{
		FileInputStream fs=new FileInputStream(ConstantsData.Excel_Path);
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		XSSFSheet sheet=workbook.getSheetAt(0);
		XSSFCell val=sheet.getRow(x).getCell(y);
		String URL=val.toString();
		return URL;
		
		
		
		
		
		
	}

}
