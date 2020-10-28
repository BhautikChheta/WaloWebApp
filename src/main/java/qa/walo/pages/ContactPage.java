package qa.walo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.walo.base.TestBase;

public class ContactPage extends TestBase {
	
	@FindBy(name = "your-name")
	WebElement yourName;
	
	@FindBy(name = "your-email")
	WebElement yourEmail;
	
	@FindBy(name = "your-message")
	WebElement yourMessage;
	
	@FindBy(xpath = "//input[@type = 'submit']")
	WebElement send;
	
	//initialize all the page factory elements located by @FindBy with the help of driver webdriver.
	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String contactPageTitle() {
		return driver.getTitle();
	}
	
	public String contactPageURL() {
		return driver.getCurrentUrl();
	}
	
	public void enterYourName() {
		yourName.sendKeys(prop.getProperty("name"));
	}
	
	public void enterYourEmail() {
		yourEmail.sendKeys(prop.getProperty("email"));
	}
	
	public void enterYourMessage() {
		yourMessage.sendKeys(prop.getProperty("message"));
	}
	
	public void clickonSend() {
		send.click();
	}

}
