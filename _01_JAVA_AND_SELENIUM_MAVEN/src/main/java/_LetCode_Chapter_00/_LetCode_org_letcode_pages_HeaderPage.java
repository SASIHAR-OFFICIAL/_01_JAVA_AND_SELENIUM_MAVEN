package _LetCode_Chapter_00;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public class _LetCode_org_letcode_pages_HeaderPage extends _LetCode_Chapter_00._projectSpecific_LetCodeBase {
	public _LetCode_org_letcode_pages_HeaderPage(RemoteWebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickSignUp() {

	}

	public void clickLoginMenu() {
		driver.findElement(By.linkText("Log in")).click();
	}
	
	public void clickSignOut() {
		driver.findElement(By.linkText("Sign out")).click();
	}


}
