package _DataProvider;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class _03_DataProvider_Super_Class {

	@org.testng.annotations.DataProvider(name ="input")
	@Test
	String[][] DataProvider() {
		String[][] data = new String[2][2];
		data [0][0]="Admin";
		data [0][1]="admin123";
		
		data [1][0]="Admin1";
		data [1][1]="admin123";
		
		return data;
	}

}
