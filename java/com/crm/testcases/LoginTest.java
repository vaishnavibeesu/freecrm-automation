package com.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.basepage.TestBase;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;

public class LoginTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	public LoginTest(){
		super();
	}
	@BeforeMethod
	public void setUp() {
		intialization();
		loginPage = new LoginPage();
	}
//	@Test(priority=1)
//	public void loginPageTitleTest() {
//		String title = loginPage.validateLoginPageTitle();
//		Assert.assertEquals(title,"Free CRM - CRM software for customer relationship management, sales, and support.");
//	}
//	@Test(priority=2)
//	public void crmLogoImageTest() {
//		boolean flag = loginPage.validateCRMImg();
//		Assert.assertTrue(flag);
//	}
	@Test(priority=3)
	public void loginTest()
	{
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
//    @AfterMethod
//     public void tearDown() {
//	driver.quit();
}

