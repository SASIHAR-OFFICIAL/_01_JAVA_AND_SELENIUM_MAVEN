package CrossBowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _03_BrmtremplintechLogin {

	@Parameters({"parameter Username","parameter Password"})
	@Test
	public void tremplintech_Login(String Username,String Password ) throws InterruptedException {

		WebDriver d=new ChromeDriver();
		d.get("http://brm.tremplintech.in/web_pages/ord_reg.aspx");
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"txt_unam\"]")).sendKeys(Username);
		d.findElement(By.xpath("//*[@id=\"txt_pass\"]")).sendKeys(Password);
		d.findElement(By.xpath("//*[@id=\"Button3\"]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[6]/a")).click();
		Select product=new
				Select(d.findElement(By.name("ctl00$ContentPlaceHolder1$ddl_prodcate")));
		Thread.sleep(5000);
		//product.selectByIndex(10);
		product.selectByVisibleText("watch");
	}

}