package qa.walo.pages;

import org.openqa.selenium.support.PageFactory;

import qa.walo.base.TestBase;

public class AboutPage extends TestBase {
	
	public AboutPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String aboutPageURL() {
		return driver.getCurrentUrl();
	}
}
