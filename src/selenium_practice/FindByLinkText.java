package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class FindByLinkText {

	
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver;
		String driverPath = "/Users/nurbekkasymbekuulu/Documents/selenium dependencies/driver/chromedriver";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String baseUrl = "https://letskodeit.teachable.com/p/practice";
		driver.get(baseUrl);
		
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Pract")).click();

}	
}