package _DataProvider_From_Excel_WebPage;


import org.testng.annotations.DataProvider;

public class Get_Data_From_ReadExcel {
	
	@DataProvider(/* indices = {1, 2}, */ parallel = !true)
	
	public String[][] getData() {
		String[][] excelData = ReadExcel.getExcelData();
//		String[][] data = new String[3][2];
//		// row 1
//		data[0][0] = "koushik350@gmail.com";
//		data[0][1] = "Pass123$";
//
//		data[1][0] = "koushik1@letcode.in";
//		data[1][1] = "Pass123$";
//		
//		data[2][0] = "last data";
//		data[2][1] = "Pass123$";

		return excelData;
	}

}