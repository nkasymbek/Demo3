package selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {
	public static void main(String[] args) {
		WebDriver driver;
		String driverPath = "/Users/nurbekkasymbekuulu/Documents/selenium" + " dependencies/driver/chromedriver";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new FirefoxDriver();
		
		String baseURL ="http://www.google.com";
		driver.get(baseURL);
		
		
	}

}
