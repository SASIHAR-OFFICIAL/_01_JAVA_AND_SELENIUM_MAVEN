package _04_Read_From_Excel_LetCode;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _06_Read_From_Excel_3 {

	public static void main(String[] args) throws IOException {

		FileInputStream  fileName= new FileInputStream ("C:\\WebDriver\\TESTING FILES\\XLSX FILES.xlsx");
		XSSFWorkbook workBook_Obj = new XSSFWorkbook(fileName);
		XSSFSheet sheetAt = workBook_Obj.getSheet("II A");
		int lastRowNum = sheetAt.getLastRowNum();
		//int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		short lastCellNum = sheetAt.getRow(0).getLastCellNum();
		for (int i = 0; i <=lastRowNum; i++) {
			XSSFRow row = sheetAt.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter DF = new DataFormatter();
				String formatCellValue = DF.formatCellValue(cell);
				System.out.println(formatCellValue);
			} 
		}

	}

}
