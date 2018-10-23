package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClosePopUp {
	
	private WebDriver driver;
	By PopUp = By.xpath("//*[contains(@class,'icon-close')]");
	
	public ClosePopUp(WebDriver driver) {
		this.driver=driver;
	}
	private WebElement closePopUp() {
		return driver.findElement(PopUp);	
		
	}
	
	public void removePopUp() throws InterruptedException {
		/*FluentWait w = new FluentWait(driver);
		w.until(Expected)*/
		Thread.sleep(5000);
		closePopUp().click();
	}

}
