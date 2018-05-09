package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByClassName {
	
	public static void main(String[] args) throws Exception{
		
		WebDriver driver;String driverPath = "/Users/nurbekkasymbekuulu/Documents/selenium dependencies/driver/chromedriver";
		System.setProperty("webdriver.chrome.driver", driverPath);
	
		driver = new ChromeDriver();
		String baseUrl = "https://demostore.x-cart.com/";
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		driver.findElement(By.className("title")).click();;
		
	}

}
