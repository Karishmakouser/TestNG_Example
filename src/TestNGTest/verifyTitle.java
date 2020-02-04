package TestNGTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class verifyTitle {
	WebDriver driver;
	@Parameters("brower")
	@Test
	public void getVerifyTitle(String browserName) throws InterruptedException {
		
	if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.out.println("this is from chromedriver");
//			}else if(browserName.equalsIgnoreCase("firefox")) {
//				System.setProperty("webdriver.firefox.driver", "");
//				driver= new FirefoxDriver();
//			} else if(browserName.equalsIgnoreCase("ie")) {
//				driver= new InternetExplorerDriver();
//			}
	
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	driver.findElement(By.name("q")).sendKeys("testng");
	
	}
}
}