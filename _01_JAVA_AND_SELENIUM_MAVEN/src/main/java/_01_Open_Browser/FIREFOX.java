package _01_Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FIREFOX {
@Test
	public void Firefox_Maven() {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.com/");
		driver.navigate().to("https://web.whatsapp.com/");
		driver.quit();
	}

}
