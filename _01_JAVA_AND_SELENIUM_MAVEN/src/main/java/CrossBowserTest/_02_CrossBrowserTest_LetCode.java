package CrossBowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class _02_CrossBrowserTest_LetCode {
	RemoteWebDriver driver;
	@Test
	public void login(String email, String pass, String browser) {
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.err.println("browser is not defined");
			break;
		}
		driver.get("https://letcode.in/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
		String title = driver.getTitle();
		System.out.println("Title is "+title);
	}}
