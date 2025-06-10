package _LetCode_Chapter_00;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class _projectSpecific_LetCodeBase extends _00_SeleniumBase{
	
	@BeforeMethod
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://letcode.in/");
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	

}
