package stepDefinition;

import com.qa.pages.HomePageAfterSignIn;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class LoginFreeCRMPageStepDefinition extends TestBase{
	
	LoginPage loginPage = new LoginPage();		//created object for LoginPage class
	HomePageAfterSignIn homePage = new HomePageAfterSignIn();
	
	
	@Given("^user is on application webpage$")
	public void user_is_on_application_webpage()  {
	 //we have created initialization method inside TestBase class
		TestBase.initialization(); 
	}

	@Then("^validate login page$")
	public void validate_login_page()  {
		LoginPage loginPage = new LoginPage();
	String title	=	loginPage.validateLoginPageTitle();
	Assert.assertEquals("Cogmento CRM", title);
	}

	
	  @Then("^validate login button$") public void validate_login_button() {
	  boolean loginBtn = loginPage.validateLoginBtn(); Assert.assertTrue(loginBtn);
	  }
	 

	@Then("^user provide username and password$")
	public void user_provide_username_and_password()  {
		/*loginPage.validateLogin(prop.getProperty(key), pwd)
		 * for key and pwd please take exact words which are mentioned inside config.properties file */	
	loginPage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^user click on Login button$")
	public void user_click_on_Login_button()  {
		/* not writing any code for click on login button as click on login button is already included inside validateLogin method. 
		 * And validateLogin method is already called in last @Then which is  @Then("^user provide username and password$")*/
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals("Cogmento CRM", homePageTitle);
	}

	@Then("^validate username after logged in$")
	public void validate_username_after_logged_in()  {
	 Boolean userName = homePage.verifyCorrectUserName();
	 Assert.assertTrue(userName);
	}


}
