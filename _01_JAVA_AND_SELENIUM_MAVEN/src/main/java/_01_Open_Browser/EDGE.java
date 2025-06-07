package _01_Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EDGE {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.google.com/");
	}

}
