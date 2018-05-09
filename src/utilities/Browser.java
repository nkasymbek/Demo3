package utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browser {

	private static WebDriver driver;

	public static WebDriver getDriver() {

		if (driver == null || ((RemoteWebDriver) driver).getSessionId() == null) {

			if (Config.getPropertyValue("browser").equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", Config.getPropertyValue("chromePath"));
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
			} else if (Config.getPropertyValue("browser").equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", Config.getPropertyValue("ffPath"));
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
			} else {
				System.setProperty("webdriver.chrome.driver", Config.getPropertyValue("chromePath"));
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}

			return driver;
		}
		return driver;
	}

}