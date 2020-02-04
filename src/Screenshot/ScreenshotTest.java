package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenshotTest {
	
public static void takesSnap(WebDriver driver,String filename ) {
		
		
		TakesScreenshot takesSnap =(TakesScreenshot) driver;
		File snap = takesSnap.getScreenshotAs(OutputType.FILE);
		File dest= new File("snaps/"+filename+".png");
		
		try {
			Files.move(snap, dest);
			System.out.println("snapshot taken:"+dest.getAbsolutePath());
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
