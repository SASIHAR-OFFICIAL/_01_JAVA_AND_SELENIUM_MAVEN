package _DataProvider_From_Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _03_Read_From_Excel {

	public static void main(String[] args) throws IOException {
		//FileInputStream FIS_Obj = new FileInputStream("C:\\WebDriver\\TESTING FILES\\HRM Login - Copy.xlsx");
		FileInputStream FIS_Obj = new FileInputStream("C:\\WebDriver\\TESTING FILES\\BATCH LIST PROJECT.xlsx");
		XSSFWorkbook XW_Obj = new XSSFWorkbook(FIS_Obj);
		XSSFSheet xSheet_Obj = XW_Obj.getSheetAt(0);
		int lastRowNum = xSheet_Obj.getLastRowNum();
		short lastCellNum = xSheet_Obj.getRow(0).getLastCellNum();
		for (int i = 0; i <=lastRowNum; i++) {
			XSSFRow row = xSheet_Obj.getRow(i);
			
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				
				DataFormatter df = new DataFormatter();
				String formatCellValue = df.formatCellValue(cell);
				
				System.out.println(formatCellValue);
			} 		}	}}
