package Screenshot;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.testScreenShots.ScreenshotTest;

public class LoginTest extends ScreenshotTest {
	
	WebDriver driver = new ChromeDriver();
	@BeforeMethod
	
	public void Login() {
		driver.get("https://www.google.com/");
		String  actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		assertEquals( expectedTitle,actualTitle);
		
	}
	@AfterMethod()
	public void Logout(ITestResult result) {		//method m for running thousand of test cases
		if(result.getStatus()==ITestResult.FAILURE)
		ScreenshotTest.takesSnap(driver, result.getMethod().getMethodName());
		driver.close();
	}
	@Test
	
	public void sendKey() {
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.quit();
	}
	

}
