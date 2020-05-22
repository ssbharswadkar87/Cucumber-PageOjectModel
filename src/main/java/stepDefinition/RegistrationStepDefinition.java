package stepDefinition;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class RegistrationStepDefinition {

	WebDriver driver;

	@Given("^user is already on registartion page$")
	public void user_is_already_on_registartion_page() {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@When("^title of the page is Login - My Store$")
	public void title_of_the_page_is_Login_My_Store() {

		String title = driver.getTitle();
		Assert.assertEquals("Login - My Store", title);
		System.out.println("Title of current page is ==>" + title);

	}

	@Then("^user enter emailid$")
	public void user_enter_emailid() {
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("ssbharswadkar87@gmail.com");
	}

	@Then("^user click on create an account button$")
	public void user_click_on_create_an_account_button() {
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();

	}

	@Then("^user is on create customer page$")
	public void user_is_on_create_customer_page() {
		boolean veificationText = driver.findElement(By.xpath("//h1[contains(text(),'Create an account')]"))
				.isDisplayed();
		Assert.assertTrue(veificationText);
		System.out.println("Verification text on the page is displayed correctly==>" + veificationText);
	}

	@Then("^user click on Title$")
	public void user_click_on_Title() {
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
	}

	@Then("^user give name as FirstName$")
	public void user_give_name_as(DataTable userName) {		//DataTable keyword we have to use
	for(Map<String, String>	name : userName.asMaps(String.class, String.class)) {
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys(name.get("FirstName"));
		}
	}

	@Then("^user give surname as LastName$")
	public void user_give_surname_as() {
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("IOP");
	}

	@Then("^user give Password$")
	public void user_give_Password() {
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("abcxyz");
	}

	@Then("^user give Address$")
	public void user_give_Address() {
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Brighton Road");
	}

	@Then("^user give City$")
	public void user_give_City() {
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("London");
	}

	@Then("^user select State$")
	public void user_select_State() {
		Select state = new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
		state.selectByIndex(2);
	}

	@Then("^user give PostalCode$")
	public void user_give_PostalCode() {
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("123456");
	}

	@Then("^user give MobilePhone$")
	public void user_give_MobilePhone() {
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("9876543210");
	}

	@Then("^user giveAddressAlias$")
	public void user_giveAddressAlias() {
		driver.findElement(By.xpath("//input[@id='alias']")).clear();
		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("asdfghjkl");
	}
	
	@Then("^close browser$")
	public void close_browser() {
		driver.quit();
	}

}
