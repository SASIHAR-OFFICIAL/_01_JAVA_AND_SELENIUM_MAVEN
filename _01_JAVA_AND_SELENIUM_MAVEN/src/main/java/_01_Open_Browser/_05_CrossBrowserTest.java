package _01_Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _05_CrossBrowserTest {

    WebDriver driver;

	    @Parameters("browser")
	    @BeforeMethod
	    public void setup(String browser) {
	        if (browser.equalsIgnoreCase("chrome")) {
	            driver = new ChromeDriver();
	        } else if (browser.equalsIgnoreCase("firefox")) {
	            driver = new FirefoxDriver();
	        } else if (browser.equalsIgnoreCase("edge")) {
	            driver = new EdgeDriver();
	        } else {
	            throw new IllegalArgumentException("Invalid browser: " + browser);
	        }
	        driver.manage().window().maximize();
	    }

	    @Test
	    public void openApp() {
	        driver.get("https://www.google.com");
	        System.out.println("Title: " + driver.getTitle());
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}