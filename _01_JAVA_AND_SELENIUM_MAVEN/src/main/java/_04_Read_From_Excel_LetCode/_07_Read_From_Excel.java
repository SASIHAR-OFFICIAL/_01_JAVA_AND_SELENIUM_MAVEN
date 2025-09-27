package _04_Read_From_Excel_LetCode;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _07_Read_From_Excel {

	public static void main(String[] args) throws IOException {

		FileInputStream FIS = new FileInputStream ("C:\\WebDriver\\TESTING FILES\\XLSX FILES.xlsx");
		XSSFWorkbook XWB_Obj = new XSSFWorkbook(FIS);
		XSSFSheet sheet_Obj = XWB_Obj.getSheet("II A");
		int lastRowNum = sheet_Obj.getLastRowNum();
		short lastCellNum = sheet_Obj.getRow(0).getLastCellNum();
		for (int i = 0; i <=lastRowNum; i++) {
			XSSFRow row = sheet_Obj.getRow(i);
			for (int j = 0; j <lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter DF_Obj = new DataFormatter();
				String formatCellValue = DF_Obj.formatCellValue(cell);
				System.out.println(formatCellValue);
			} 
		}
	}
}
