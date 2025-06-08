package _01_Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CHROME {
	
@Test
	public void Chrome_Maven() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.quit();
	}

}
