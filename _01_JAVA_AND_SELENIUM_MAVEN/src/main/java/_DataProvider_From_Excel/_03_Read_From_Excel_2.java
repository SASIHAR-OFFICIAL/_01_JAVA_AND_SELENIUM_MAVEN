package _DataProvider_From_Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.PrivateKey;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _03_Read_From_Excel_2 {

	public static void main(String[] args) throws IOException  {
		
		FileInputStream FIS_Obj = new FileInputStream("C:\\WebDriver\\TESTING FILES\\BATCH LIST PROJECT.xlsx");
			XSSFWorkbook XW_Obj = new XSSFWorkbook(FIS_Obj);
			//"IV-B SEC"
			XSSFSheet xs_objSheet = XW_Obj.getSheetAt(1);
			int lastRowNum = xs_objSheet.getLastRowNum();
			short lastCellNum = xs_objSheet.getRow(1).getLastCellNum();


			XSSFCell cell;
			for (int i = 1; i < lastRowNum; i++) {
				XSSFRow row = xs_objSheet.getRow(i);
				for (int j = 0; j < lastCellNum; j++) {
					cell = row.getCell(j);
					DataFormatter dF = new DataFormatter();
					String formatCellValue = dF.formatCellValue(cell);
					System.out.println(formatCellValue);
				} 
			}

			XW_Obj.close();
		}

	}


		

