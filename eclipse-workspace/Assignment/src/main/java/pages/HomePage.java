package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver driver;
	
	By department = By.xpath("//*[text()='Department']");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	private WebElement getDepartment() {
		return driver.findElement(department);
		}	
	
	public void selectDepartment() {
		WebElement ele = getDepartment();
		ele.click();
	}
	}
	
	
	