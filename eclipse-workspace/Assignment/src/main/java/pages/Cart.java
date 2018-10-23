package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {
	
	private WebDriver driver;
	By addToCart = By.xpath("//*[@id='add-to-cart-button']");
	
	public Cart(WebDriver driver) {
		this.driver=driver;
	}
	private WebElement getaddToCart() {
		return driver.findElement(addToCart);
	}
	
	public void addtoCart(){
		getaddToCart().click();
	}
}
