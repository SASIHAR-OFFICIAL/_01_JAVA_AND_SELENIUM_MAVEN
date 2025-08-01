package _DataProvider;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProvider_Own_class_01 {
	WebDriver driver;
	@DataProvider(name = "Details")

	public String[][] U_Name_P_Word() {
		String [][] data = new String[2][2];
		data[0][0] = "sylix";
		data[0][1] = "admin";
		
		data[1][0] = "sylix";
		data[1][1] = "admin";
		return data;
		
		}
	@Test(dataProvider = "Details")
	public void WebLogin(String name, String Pas) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("http://brm.tremplintech.in/web_pages/ord_reg.aspx");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"txt_unam\"]")).sendKeys(name);
		driver.findElement(By.xpath("//*[@id=\"txt_pass\"]")).sendKeys(Pas);
		driver.findElement(By.xpath("//*[@id=\"Button3\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[6]/a")).click();
		Select product=new
				Select(driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddl_prodcate")));
		Thread.sleep(5000);
		//product.selectByIndex(10);
		product.selectByVisibleText("watch");
		driver.quit();
		
	}

}
