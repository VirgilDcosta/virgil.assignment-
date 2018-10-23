package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenCapture {

	private WebDriver driver;
	
	public ScreenCapture(WebDriver driver) {
		this.driver=driver;
	}
	
	public void screenShot(String str) throws IOException {
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src,new File("C:/"+str+"_screenshot.jpg"));
	}
}
