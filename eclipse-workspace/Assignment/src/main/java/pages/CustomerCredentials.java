package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CustomerCredentials {

	private WebDriver driver;
	
	By email = By.xpath("//*[@id=\"ap_email\"]");
	
	
	public CustomerCredentials(WebDriver driver) {
		this.driver=driver;
	}
	
	private WebElement getemail() {
		
		return driver.findElement(email);
	}
	
	
	public boolean emailValid() {
		boolean b=false;
		try {
			b=getemail().isDisplayed();
		}catch(Exception e){
			e.printStackTrace();
		}
		return b;
	}
	
}
	

