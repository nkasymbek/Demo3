package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Instagram {
	
		WebDriver driver;

		@BeforeClass
		public void setup() {

			String driverPath = "/Users/nurbekkasymbekuulu/Documents/selenium" + " dependencies/driver/chromedriver";
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		

		@Test
		public void logIn() throws InterruptedException {
			driver.get("https://www.instagram.com/?hl=en");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			WebElement logIn = driver
					.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[2]/p/a"));
			logIn.click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("nurbcha_");
			Thread.sleep(2000);

			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("147789insta");
			Thread.sleep(2000);

			WebElement logInB = driver.findElement(By.xpath("//button[@class='_qv64e _gexxb _4tgw8 _njrw0']"));
			logInB.click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("cybertekchicago");
			driver.findElement(By.xpath("//span[.='CybertekChicago']")).click();

			driver.findElement(By.xpath("//a[@href='/p/BebFRb5Bur3/?taken-by=cybertekchicago']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.linkText("Like")).click();
			WebElement comment = driver.findElement(By.xpath("//span[.='Comment']"));
			comment.click();
			
			Thread.sleep(3000);
			WebElement abc = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/article/div[2]/section[3]/form/textarea"));
			abc.sendKeys("Great Team!", Keys.ENTER);
			
			
			
			
			
			
		

		}
}
