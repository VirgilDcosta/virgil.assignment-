package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KindlePage {

	private WebDriver driver;
	
	By kindle = By.linkText("Kindle");
	
	public KindlePage(WebDriver driver) {
		this.driver=driver;
	}
	private WebElement getKindle() {
		return driver.findElement(kindle);
	}
	
	public void slectKindle() {
		getKindle().click();
	}
}
