package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout {
	private WebDriver driver;
	
	By proceed = By.xpath("//*[@id=\"hlb-next-steps\"]/a[2]");
	
	public Checkout(WebDriver driver){
		this.driver=driver;
	}
	private WebElement getproceed() {
		return driver.findElement(proceed);
		}
	
	public void proceedtoCheckout() {
		getproceed().click();
	}
}