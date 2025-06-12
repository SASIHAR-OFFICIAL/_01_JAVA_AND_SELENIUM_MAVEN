package _DataProvider;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class _02_DataProvider_OrangeHRM {
	WebDriver driver;
	@org.testng.annotations.DataProvider(name ="input")
	@Test
	String[][] DataProvider() {
		String[][] data = new String[2][2];
		data [0][0]="Admin";
		data [0][1]="admin123";
		
		data [1][0]="Admin";
		data [1][1]="admin123";
		
		return data;
	}
	
	@Test(dataProvider = "input")
void HRM_Login(String a, String b) {
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(a);
	driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(b);
	driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	driver.quit();
}
}
