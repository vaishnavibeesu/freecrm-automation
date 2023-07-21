package com.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.basepage.TestBase;
import com.crm.pages.ContactsPage;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;

public class ContactsPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;

	public ContactsPageTest(){
		super();
	}
	@BeforeMethod
	public void setUp() {
		intialization();
		loginPage=new LoginPage();
		contactsPage=new ContactsPage();
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		contactsPage=homePage.openContacts();
	}
//	@Test
//	public void contactsTest() {
//		boolean flag=contactsPage.validateContactsName();
//		Assert.assertTrue(flag);
//	}
	@Test
     public void createNameTest() {
		contactsPage.clickCreateName() ;
	}
	@Test
	public void contactDetailsTest() {
		contactsPage.enterContactDetails();
	}
//	@Test
//	public void statusTest() {
//		contactsPage.clickStatus();
//	}
//	@Test
//	public void statusNewTest() {
//		contactsPage.newStatus();}

}
