package TestNGTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGGrid {
	@Test
	public void sampleTest() {
		
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
			
			
			
		}
	
}

