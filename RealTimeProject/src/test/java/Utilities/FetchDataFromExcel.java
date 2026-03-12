package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FetchDataFromExcel extends BaseClass {
	
	public static String getDataFromExcel(int x, int y) throws IOException {
		
		FileInputStream fs = new FileInputStream(ConstantsData.ConstantData.Excel_Path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		XSSFCell val = sheet.getRow(x).getCell(y);
		
		String URL = val.toString();
		
		return URL;
	}
	
	
   public static String writeDataToExcel(int t, int z) throws IOException {
	   
	   // Get customer ID after customer creation
	   WebElement CustElement = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]"));
	   String costumerId = CustElement.getText();
	   
	   // Open the Excel file
	   FileInputStream fis = new FileInputStream(ConstantsData.ConstantData.Excel_Path);
	   XSSFWorkbook workbook = new XSSFWorkbook(fis);
	   XSSFSheet sheet = workbook.getSheetAt(0);
	   
	   
	   // Get or create row
	   Row row = sheet.getRow(t);
	   if(row == null) {
		   row = sheet.createRow(t);
	   }
	   
	   // Create cell
	   Cell cell = row.createCell(z);
	   cell.setCellValue(costumerId);
	   
	   // Save the changes
	   FileOutputStream fos = new FileOutputStream(ConstantsData.ConstantData.Excel_Path);
	   workbook.write(fos);
	   
	   workbook.close();
	   fis.close();
	   fos.close();
	   
	   return costumerId;
   }	

}
