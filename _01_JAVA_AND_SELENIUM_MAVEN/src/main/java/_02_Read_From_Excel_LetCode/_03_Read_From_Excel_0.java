package _02_Read_From_Excel_LetCode;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _03_Read_From_Excel_0 {

	public static void main(String[] args) throws IOException  {
		
		FileInputStream FIS_Obj = new FileInputStream("C:\\WebDriver\\TESTING FILES\\BATCH LIST PROJECT.xlsx");
			XSSFWorkbook XW_Obj = new XSSFWorkbook(FIS_Obj);
			
			XSSFSheet xs_objSheet = XW_Obj.getSheetAt(1);
//			int lastRowNum = xs_objSheet.getLastRowNum();
//			short lastCellNum = xs_objSheet.getRow(1).getLastCellNum();

				XSSFRow row = xs_objSheet.getRow(3);
				
					XSSFCell cell = row.getCell(3);
					String stringCellValue = cell.getStringCellValue();
//					DataFormatter dF = new DataFormatter();
//					String formatCellValue = dF.formatCellValue(cell);
					System.out.println(stringCellValue);
			

			XW_Obj.close();
		}

	}