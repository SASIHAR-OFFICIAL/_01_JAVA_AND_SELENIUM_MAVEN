package _01_Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EDGE {
@Test
	public void Edge_Maven() {
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.quit();
	}

}
