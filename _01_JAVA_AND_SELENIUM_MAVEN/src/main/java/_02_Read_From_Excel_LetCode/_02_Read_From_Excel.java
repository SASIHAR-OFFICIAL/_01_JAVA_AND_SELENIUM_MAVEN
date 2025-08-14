package _02_Read_From_Excel_LetCode;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _02_Read_From_Excel {

	public static void main(String[] args) throws IOException {

		FileInputStream fil_Obj = new FileInputStream("C:\\WebDriver\\TESTING FILES\\HRM Login - Copy.xlsx");
		XSSFWorkbook W_Obj = new XSSFWorkbook(fil_Obj);
		XSSFSheet S_Obj = W_Obj.getSheetAt(0);
		for (int i = 1; i <5; i++) {
			XSSFRow row = S_Obj.getRow(i);
			for (int j = 0; j < 2; j++) {
				XSSFCell cell = row.getCell(j);
				String cell_ValueString = cell.getStringCellValue();
				System.out.println(cell_ValueString);
			} 
			W_Obj.close();
		}
	}


}
