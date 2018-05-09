package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(xpath = "//h3[.='Create an account']")
	public WebElement createAccountlabel;
	
	@FindBy(xpath = "//h3[.='Already registered?']")
	public WebElement alreadyRegisteredLabel;
	
	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(id="password")
	public WebElement password;
	

	
	public boolean isAt() {
		return driver.getTitle().equals("Login - My Store");
	}
	public void login(String lEmail, String lPassword) {
		email.sendKeys(lEmail);
		password.sendKeys(lPassword);
		//SubmitLogin.click();
	}

}
