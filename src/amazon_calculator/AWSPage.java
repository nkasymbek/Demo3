package amazon_calculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Browser;

public class AWSPage {
	private WebDriver driver;

	public AWSPage() {
		driver = Browser.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//table[@class='regionSelectPanel']//select")
	public WebElement chooseRegionDropdown;

}
