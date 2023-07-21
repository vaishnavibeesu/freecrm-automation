package com.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.basepage.TestBase;
import com.crm.pages.ContactsPage;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	ContactsPage contactsPage;
	public HomePageTest(){
		super();
	}
	@BeforeMethod
	public void setUp() {
		intialization();
		loginPage=new LoginPage();
		contactsPage=new ContactsPage();
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	@Test(priority=1)
	public void logoNameTest() {
		boolean flag = homePage.validateLogoName() ;
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=2)
	public void todayTest() {
		boolean flag = homePage.checkToday() ;
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void searchTest() {
		homePage.clickSearchBtn() ;
}
	@Test(priority=4)
	public void contactsTest() {
		contactsPage = homePage.openContacts();
	}
	 @AfterMethod
     public void tearDown() {
	driver.quit();
}
	
	
}
	

	


