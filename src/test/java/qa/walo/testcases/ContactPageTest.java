package qa.walo.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.walo.base.TestBase;
import qa.walo.pages.ContactPage;
import qa.walo.pages.HomePage;

public class ContactPageTest extends TestBase{
	
	HomePage hp2;
	ContactPage cp2;
	
	//call the parent class (testbase) constructor with the help of super keyword here.
	public ContactPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		hp2 = new HomePage();
		cp2 = hp2.openContactPage();	
	}
	
	
	@Test
	public void verifyContactPageTitleTest() {
		String cpTitle = cp2.contactPageTitle();
		Assert.assertEquals(cpTitle, "Contact Us | WALO app");
	}
	
	@Test
	public void verifyContactPageURLTest() {
		String cpURL = cp2.contactPageURL();
		Assert.assertEquals(cpURL, "https://walo.app/contact-us/");
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
