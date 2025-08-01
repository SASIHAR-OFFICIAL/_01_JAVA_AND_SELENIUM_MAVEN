package _DataProvider;

import java.util.concurrent.ConcurrentHashMap.KeySetView;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Enter;

public class _01_DataProvider_Own_class_02 {
	
	@DataProvider(name = "Search_Data")
	public String[][] search_data() {
		String [][] data = new String[2][2];
		 data[0][0]= "Coim";
		 data[0][1]= "batore";
//		 data[1][1]= "Salem";
//		 data[1][0]= "Chennai";
		return data;
		
	}
	
	@Test(dataProvider = "Search_Data")
	
	public void Search_In_Google(String DataFrom1, String DataFrom2 ) {
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.bing.com/");
		WebElement search_Area = driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]"));
		search_Area.sendKeys(DataFrom1+DataFrom2);
		search_Area.sendKeys(Keys.ENTER);
		
	}
	

}
