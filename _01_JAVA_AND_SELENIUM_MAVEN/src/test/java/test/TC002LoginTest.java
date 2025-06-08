package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import _LetCode_Chapter_00._LetCode_org_letcode_pages_HeaderPage;
import _LetCode_Chapter_00._LetCode_org_letcode_pages_HomePage;
import _LetCode_Chapter_00._LetCode_org_letcode_pages_LoginPage;
import _LetCode_Chapter_00._projectSpecific_LetCodeBase;

public class TC002LoginTest extends _projectSpecific_LetCodeBase{
	@Test
	public void login2() throws InterruptedException {
		_LetCode_org_letcode_pages_HomePage home = new _LetCode_org_letcode_pages_HomePage(driver);
		String welcomeMessage = home.validateWelcomeMessage();
		Assert.assertEquals(welcomeMessage.trim(), "Welcome to LetCode!");
		_LetCode_org_letcode_pages_HeaderPage header = new _LetCode_org_letcode_pages_HeaderPage(driver);
		header.clickLoginMenu();
		_LetCode_org_letcode_pages_LoginPage login = new _LetCode_org_letcode_pages_LoginPage(driver);
		login.enterUserEmail("koushik1@letcode.in");
		login.enterPassword("Pass123$");
		login.clickLogin();
		Thread.sleep(3000);
		String toastMessage = home.validateToastMessage();
		System.out.println(toastMessage);
		Assert.assertEquals(toastMessage.trim(), "Welcome Koushik LetCode");
	}

}
