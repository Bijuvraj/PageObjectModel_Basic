package utitity;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelClass {
	XSSFSheet sheet;
	XSSFWorkbook workbook;
	
	XSSFRow row;
	XSSFCell cell;
	
	public void printValue()
	{
		try {
			String path = "C:\\Users\\bijuv\\Downloads\\Normal.xlsx";
			File src = new File(path);
			FileInputStream fi = new FileInputStream(src);
			workbook = new XSSFWorkbook(fi);
			sheet = workbook.getSheet("sheet1");
			row = sheet.getRow(1);
			cell = row.getCell(0);
			String val = cell.getStringCellValue();  //get String value
			System.out.println("Name : "+val);
			row = sheet.getRow(1);
			cell = row.getCell(1);
			long d = (long) cell.getNumericCellValue(); //get numeric value
			System.out.println("Age : "+d);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

