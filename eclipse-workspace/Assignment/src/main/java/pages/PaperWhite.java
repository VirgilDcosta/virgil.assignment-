package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaperWhite {
	
	private WebDriver driver;
	
	By paperwhite = By.xpath("//*[@id=\"kfs_family_1\"]/a/span[1]");
	
	public PaperWhite(WebDriver driver) {
		this.driver=driver;
	}
	
	private WebElement getwhite() {
		return driver.findElement(paperwhite);
	}
	
	public void getPaperWhite() {
		getwhite().click();
	}

}
