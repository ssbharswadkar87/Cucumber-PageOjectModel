package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.util.TestBase;

public class HomePageAfterSignIn extends TestBase{
	/*we have to define object repository (page factory) where we will define all
	 * web elements which we have to test and which are available on this page */

	// We are using @FindBy annotation in the place of driver.findElement
	@FindBy(xpath = "//span[contains(text(),'Shantnu Bharswadkar')]")
	static WebElement userNameLabel;

	@FindBy(xpath = "//span[contains(text(),'Contacts') and @class='item-text']")
	static WebElement contactsLink;

	@FindBy(xpath = "//span[contains(text(),'Deals') and @class='item-text']")
	static WebElement dealsLink;

	@FindBy(xpath = "//span[contains(text(),'Tasks') and @class='item-text']")
	static WebElement tasksLink;

	// initializing page object
		public HomePageAfterSignIn() { // Constructor of HomePageAfterSignIn Page
			/*PageFactory.initElements(driver, pageClassToProxy) to initialize page factory
			 * with driver and available elements*/
			PageFactory.initElements(driver, this);
			/* this means current class object which we have defined like userNameLabel,
			 * contactsLink, dealsLink, tasksLink*/
		}
		
		// Actions

		public String verifyHomePageTitle() {
			return driver.getTitle();
		}

		public boolean verifyCorrectUserName() {
			return userNameLabel.isDisplayed();
		}

		public void clickOnContactsLink() {
			contactsLink.click();
		}

		public void clickOnDealsLink() {
			dealsLink.click();
		}

		public void clickOnTasksLink() {
			tasksLink.click();
		}
}
