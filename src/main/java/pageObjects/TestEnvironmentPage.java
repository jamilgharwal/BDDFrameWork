package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import constants.ConfigFileReader;

public class TestEnvironmentPage extends ConfigFileReader {

	// 1 Extend the base class
	// 2 create a constructor for this class

	public TestEnvironmentPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//span[text() ='My Account']")
	private WebElement myAccount;

	@FindBy(how = How.XPATH, using = "//a[text() ='Register']")
	private WebElement register;

	@FindBy(how = How.XPATH, using = "//a[text() ='Login']")
	private WebElement login;
	
	@FindBy (how = How.XPATH , using ="//input[@id='input-email']")
    private WebElement email;
	
	@FindBy (how = How.XPATH , using ="//input[@id='input-password']")
    private WebElement password;
	
	@FindBy (how = How.XPATH , using ="//input[@value='Login']")
	private WebElement loginButon ;


	public void clickOnMyAccount() {
		myAccount.click();
	}

	public void clickOnRegister() {
		register.click();
	}

	public void clickonLogin() {
		login.click();
	}

	public String getPageURl() {

		String actualURl = driver.getCurrentUrl();
		
		return actualURl;

		// we use junit assertions to pass or fail the verification
	}
	/**
	 * 
	 * @return
	 */
	public String getPageTitle() {
		
		String pageTitle = driver.getTitle();
		return pageTitle;
		
	}
	/**
	 * This method sends email address to email field
	 * @param emailAddress
	 */
	public void enterEmail(String emailAddress) {
		email.sendKeys(emailAddress);
	}
	
	/**
	 * This method sends password to password field
	 * @param passwordData
	 */
	public void enterPassword(String passwordData) {
		password.sendKeys(passwordData);
		
	}
	
	/**
	 * This method clicks on login button 
	 */
	public void clickOnLoginButton () {
		loginButon.click();
		
	}
}















