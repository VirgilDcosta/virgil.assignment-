package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Product {
	
	private WebDriver driver;
	
	By select = By.id("quantity");
	
	public Product(WebDriver driver) {
		this.driver=driver;
	}
	
	private WebElement quantity() {
		return driver.findElement(select);
		
	}

	public void selectQuantity(String i) {
		Select s = new Select(quantity());
		s.selectByValue(i);
	}
}
