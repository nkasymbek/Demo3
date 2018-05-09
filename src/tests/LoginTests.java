package tests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.Configuration;

public class LoginTests {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				// Configurarion.getProperty("driverPath");
				"/Users/nurbekkasymbekuulu/Documents/selenium" + " dependencies/driver/chromedriver");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(Configuration.getPropertyValue("url"));

	}

	@Test
	public void positiveLoginTest() {
		// create object from Page class
		HomePage homePage = new HomePage(driver);
		// verify at page
		Assert.assertTrue(homePage.isAt());
		// verify logo is displayed
		Assert.assertTrue(homePage.logo.isDisplayed());

		homePage.gotoLoginPage();

		LoginPage loginPage = new LoginPage(driver);
		assertTrue(loginPage.isAt());

		assertTrue(loginPage.createAccountlabel.isDisplayed());
		assertTrue(loginPage.alreadyRegisteredLabel.isDisplayed());
		
		//Enter valid email and password then click sign in
		loginPage.email.sendKeys(Configuration.getPropertyValue("email"));
		loginPage.password.sendKeys(Configuration.getPropertyValue("password"));
		//loginPage.SubmitLogin.click();
		
//		loginPage.login(Configuration.getPropertyValue("email");
//		Configuration.getProperty("password");
		
		AccountPage accountPage = new AccountPage(driver);
		assertTrue(accountPage.isAt(), "Account page is not loaded");
		assertTrue(accountPage.verifyUserOptions("ORDER HISTORY AND DETAILS",
				"MY CREDIT SLIPS", 
				"MY ADRESSES",
				"MY PERSONAL INFORMATION",
				"MY WISHLISTS"));
		
	}

}
