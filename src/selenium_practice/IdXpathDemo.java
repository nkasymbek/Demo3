package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IdXpathDemo {
	WebDriver driver;

	@BeforeClass
	public void setup() {

		String driverPath = "/Users/nurbekkasymbekuulu/Documents/selenium dependencies/driver/chromedriver";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	public void search() throws InterruptedException {
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.id("lst-ib"));
		search.sendKeys("Nurbek Kasymbek uulu");
		driver.findElement(By.name("btnK")).click();

	}

}
