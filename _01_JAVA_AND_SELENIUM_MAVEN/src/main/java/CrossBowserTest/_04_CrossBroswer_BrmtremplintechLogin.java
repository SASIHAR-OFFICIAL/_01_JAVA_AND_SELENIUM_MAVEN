package CrossBowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _04_CrossBroswer_BrmtremplintechLogin {
	WebDriver driver;
	@Parameters({"Username","Password","Broswers"})
	@Test
	 void BRM_Login(String U_Name,String P_Word,String Broswers) throws InterruptedException {
		switch (Broswers){
		case "Firefox":
		driver =new FirefoxDriver();
		break;
		case "Chrome":
		driver =new ChromeDriver();
		break;
		case "Edge":
		driver =new EdgeDriver();
		break;
		default:
			System.err.println("browser is not defined");
			break;
		}
		driver.get("http://brm.tremplintech.in/web_pages/ord_reg.aspx");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"txt_unam\"]")).sendKeys(U_Name);
		driver.findElement(By.xpath("//*[@id=\"txt_pass\"]")).sendKeys(P_Word);
		driver.findElement(By.xpath("//*[@id=\"Button3\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[6]/a")).click();
		Select product=new
				Select(driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddl_prodcate")));
		Thread.sleep(5000);
		//product.selectByIndex(10);
		product.selectByVisibleText("watch");
		driver.quit();
	}
	
}

