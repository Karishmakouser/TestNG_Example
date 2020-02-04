package TestNGTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelTestemp {
	@DataProvider(parallel= true)
	public Object[][] getData() {
		return new Object[][] {{"data 1"},{"data 2"},{"data 3"},{"data 4"}};
		
	}
		
	@Test(dataProvider="getData",threadPoolSize=1,invocationCount=2)
	
	public void Test_01( String value) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys(value);
		System.out.println("Thread ID:"+Thread.currentThread().getId());
		Thread.sleep(2000);
		driver.close();
	}
}
