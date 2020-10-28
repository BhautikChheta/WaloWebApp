package qa.walo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.walo.base.TestBase;

public class HomePage extends TestBase {
	
	//Page Factory or Object Repository (OR)
	
	@FindBy(xpath = "//img[@class='starting-logo dark-version default-logo']")
	WebElement appLogo;
	
	@FindBy(xpath = "//div[@class='heading-line']//div//h1")
	WebElement header1;
	
	@FindBy(xpath = "//li[@class='slide-out-widget-area-toggle']//div//a[contains(@href, '#sidewidgetarea')]")
	WebElement pageMenu;
	
	@FindBy(xpath = "//a[contains(text(), 'Beta']")
	WebElement betaPageLink;
	
	@FindBy(xpath = "//a[contains(text(), 'About')]")
	WebElement aboutPageLink;
	
	@FindBy(xpath = "//div[contains(@class,'menuwrapper')]//a[contains(text(), 'Contact')]")
	WebElement contactPageLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean appLogo() {
		return appLogo.isEnabled();
	}
	
	public String validateHeader1() {
		return header1.getText();
	}
	
	public AboutPage openAboutPage() {
		pageMenu.click();
		aboutPageLink.click();
		return new AboutPage();
	}
	
	public ContactPage openContactPage() {
		pageMenu.click();
		contactPageLink.click();
		return new ContactPage();
	}

}