package _LetCode_Chapter_00;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public class _LetCode_org_letcode_pages_HomePage extends _projectSpecific_LetCodeBase{

	public _LetCode_org_letcode_pages_HomePage(RemoteWebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String validateToastMessage() {
		return driver.findElementByXPath("//div[@role='alertdialog']")
				.getText();
	}

	public String validateWelcomeMessage() {
		WebElement header = driver
				.findElementByXPath("//div[contains(@class,'box title')]");
		System.out.println(header.getText());
		return header.getText();

	}

}
