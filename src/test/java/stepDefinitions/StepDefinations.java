package stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import constants.ConfigFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjects.TekSchoolHomePage;
import pageObjects.TestEnvironmentPage;
import utilities.ScreenShotUtil;

public class StepDefinations extends ConfigFileReader {
	TekSchoolHomePage tsh;
	TestEnvironmentPage tep;

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() {

	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() {

	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() {

	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() {

	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() {

	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() {

	}

	@Given("^User go to Tek School page$")
	public void user_go_to_Tek_School_page() throws IOException {
		ConfigFileReader.initialization();
		ScreenShotUtil.captureScreenShot("tekSchoolHomePage",
				"C:\\Users\\jamil gharwal\\eclipse-workspace\\BDDTestFramework\\pom.xml");
	}

	@Given("^User click on test environment$")
	public void user_click_on_test_environment() {
		tsh = new TekSchoolHomePage();
		tsh.getPageTitle();
		tsh.clickOnTestEnvironment();

	}

	@When("^User see test environment page$")
	public void user_see_test_environment_page() {
		tep = new TestEnvironmentPage();
		String pageURl = tep.getPageURl();
		String expectedPageURL = "https://www.tekschoolofamerica.com/test-environment/";
		assertEquals(expectedPageURL, pageURl);

	}

	@Then("^User verify test environment title$")
	public void user_verify_test_environment_title() {
		tep = new TestEnvironmentPage();
		String pageTitle = tep.getPageTitle();
		String expectedPageTitle = "Tek School of America Test Environment";
		assertEquals(expectedPageTitle, pageTitle);

	}

	@When("^User click on myAccount$")
	public void user_click_on_myAccount() {
		tep = new TestEnvironmentPage();
		tep.clickOnMyAccount();

	}

	@When("^User select login from dropdown$")
	public void user_select_login_from_dropdown() {
		tep = new TestEnvironmentPage();
		tep.clickonLogin();

	}

	@Then("^User should see login page$")
	public void user_should_see_login_page() {
		tep = new TestEnvironmentPage();
		String actualAccountLoginTitle = tep.getPageTitle();
		String expectedAccountLoginTitle = "Account Login";

		assertEquals(expectedAccountLoginTitle, actualAccountLoginTitle);

	}

	@When("^User enter username (.+)$")
	public void user_enter_username_test_test_com(String userName) throws InterruptedException {
		tep = new TestEnvironmentPage();
		tep.enterEmail(userName);
		Thread.sleep(2000);

	}

	@When("^User enter password (.+)$")
	public void user_enter_password_test(String password) throws InterruptedException {
		tep = new TestEnvironmentPage();
		tep.enterPassword(password);
		Thread.sleep(2000);
	}

	@When("^Click continue button$")
	public void click_continue_button() throws InterruptedException, IOException {
		tep = new TestEnvironmentPage();
		tep.clickOnLoginButton();
		Thread.sleep(2000);
		ScreenShotUtil.captureScreenShot("tekSchoolHomePage",
				"C:\\Users\\jamil gharwal\\eclipse-workspace\\BDDTestFramework\\pom.xml");

	}

	@Then("^User should be logged in successfully$")
	public void user_should_be_logged_in_successfully() throws InterruptedException, IOException {
		tep = new TestEnvironmentPage();
		String actualTitle = tep.getPageTitle();
		String expectedTitle = "My Account";
		Thread.sleep(2000);
		assertEquals(expectedTitle, actualTitle);
		ScreenShotUtil.captureScreenShot("tekSchoolHomePage",
				"C:\\Users\\jamil gharwal\\eclipse-workspace\\BDDTestFramework\\pom.xml");
	}

}
