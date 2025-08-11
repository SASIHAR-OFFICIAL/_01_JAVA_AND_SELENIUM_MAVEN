package _DataProvider_From_Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _03_Read_From_Excel_3 {

	public static void main(String[] args) throws IOException {

		FileInputStream  fileName= new FileInputStream ("C:\\WebDriver\\TESTING FILES\\II A.xlsx");
		XSSFWorkbook workBook_Obj = new XSSFWorkbook(fileName);
		XSSFSheet sheetAt = workBook_Obj.getSheetAt(0);
		int lastRowNum = sheetAt.getLastRowNum();
		//int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		short lastCellNum = sheetAt.getRow(0).getLastCellNum();
		for (int i = 0; i <=lastRowNum; i++) {
			XSSFRow row = sheetAt.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter DF = new DataFormatter();
				String formatCellValue = DF.formatCellValue(cell);
//				String stringCellValue = cell.getStringCellValue();
				
				System.out.println(formatCellValue);
			} 
		}

	}

}
