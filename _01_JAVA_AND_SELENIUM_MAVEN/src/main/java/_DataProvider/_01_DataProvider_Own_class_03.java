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

public class _01_DataProvider_Own_class_03 {
	
	@DataProvider(name = "Search_Data")
	public String[] search_data() {
		String [] data = {"Coimbatore","Erode"};
		return data;
		
	}
	
	@Test(dataProvider = "Search_Data")
	
	public void Search_In_Google(String DataFrom1  ) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.bing.com/");
		WebElement search_Area = driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]"));
		search_Area.sendKeys(DataFrom1);
		Thread.sleep(3000);
		search_Area.sendKeys(Keys.ENTER);
		
	}
	

}
