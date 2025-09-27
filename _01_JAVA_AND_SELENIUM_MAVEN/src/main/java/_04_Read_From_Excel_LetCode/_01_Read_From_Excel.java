package _04_Read_From_Excel_LetCode;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class _01_Read_From_Excel  {
	public static void main(String[] args) throws  IOException {
	
	FileInputStream FIS_obj = new FileInputStream("C:\\WebDriver\\TESTING FILES\\XLSX FILES.xlsx");
	XSSFWorkbook xxsfW_Obj = new XSSFWorkbook(FIS_obj);
	XSSFSheet sheet_obj = xxsfW_Obj.getSheet("BRM Login");
	for (int i = 1; i <=4; i++) {                // Getting Row from 1 to 4 because 0 is heading
		XSSFRow row = sheet_obj.getRow(i);       // Getting Row
		for (int j = 0; j < 2; j++) {			 // Getting ROW-CELL value from 1 and 2	
			XSSFCell cell = row.getCell(j);      // Getting ROW-CELL
			String cell_ObjString = cell.getStringCellValue(); // string is used Because data are alpha characters 
			System.out.println(cell_ObjString);
		} 
	}
	xxsfW_Obj.close();
}}
