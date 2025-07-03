package _DataProvider_From_Excel_WebPage;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Get_Data_From_ReadExcel_To_Website {

	
	@Test(dataProvider = "getData", dataProviderClass = _DataProvider_From_Excel_WebPage.Get_Data_From_ReadExcel.class)
	public void login(String data[]) throws InterruptedException {
			//	System.err.println("from parameters: "+id);
		System.err.println("Email: "+data[0]);
		System.err.println("Pass: "+data[1]);

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(data[0]);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(data[1]);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		driver.quit();

	}

}