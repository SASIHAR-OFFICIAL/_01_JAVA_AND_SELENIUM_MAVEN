package CrossBowserTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class _05_OrangeHRM {
	WebDriver driver;
	@Parameters({"UName", "PWord", "Browsers"})
	@Test
	void LoginData(String UName,String PWord, String Browsers) throws InterruptedException  {

		switch (Browsers) {
		case "Firefox":
			driver =new FirefoxDriver();
			break;
		case "Chrome":
			driver =new ChromeDriver();
			break;
		case "Edge":
			driver =new EdgeDriver();
			break;
		}


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(UName);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(PWord);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		driver.quit();

	}
}
