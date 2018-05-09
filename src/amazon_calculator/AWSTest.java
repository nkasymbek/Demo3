package amazon_calculator;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.Browser;
import utilities.Config;

public class AWSTest {

	@Test
	public void regionTest() {
		System.out.println(Config.getPropertyValue("awsUrl"));
		Browser.getDriver().get(Config.getPropertyValue("awsUrl"));

		// Default value for region
		AWSPage aws = new AWSPage();
		
		Select regionDropdown = new Select(aws.chooseRegionDropdown);
		
		String defaultValue = regionDropdown.getFirstSelectedOption().getText();
		
		System.out.println(defaultValue);
		
		Assert.assertEquals(defaultValue, Config.getPropertyValue("regionDefault"),
				"Region Dropdown Default Value verification");

		// All options
		List<WebElement> options = regionDropdown.getOptions();
		for (WebElement w : options) {
			System.out.println(w.getText());
		}
		//String[] optionsData = Config.getPropertyValue("options").split(",");

		// functional for drop down
		regionDropdown.selectByVisibleText(Config.getPropertyValue("target"));
		Assert.assertEquals(regionDropdown.getFirstSelectedOption().getText(), Config.getPropertyValue("target"));

	}

	
}
