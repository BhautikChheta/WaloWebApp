package qa.walo.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.walo.base.TestBase;
import qa.walo.pages.AboutPage;
import qa.walo.pages.HomePage;

public class HomePageTest extends TestBase{
	
	HomePage hp1;
	AboutPage ap1;
	
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		hp1 = new HomePage();
	}
	
	
	@Test(priority=1)
	public void HomePageTitleTest() {
		String title = hp1.validateHomePageTitle();
		Assert.assertEquals(title, "WALO | The app to teach your kids the value of money");
	}

	@Test(priority=3)
	public void header1test() {
		String h1 = hp1.validateHeader1();
		Assert.assertEquals(h1, "Teach your kids the value of money");
	}
	
	@Test(priority=2)
	public void appLogoTest() {
		boolean b1 = hp1.appLogo();
		Assert.assertEquals(b1, true);
	}
	
	@Test(priority=4)
	public void navigateToAboutPageTest() {
		ap1 = hp1.openAboutPage();
		String apURL = ap1.aboutPageURL();
		Assert.assertEquals(apURL, "https://walo.app/about-us/");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
