package testcases;

import org.testng.annotations.Test;

import config.TestBase;
import pages.Cart;
import pages.Checkout;
import pages.ClosePopUp;
import pages.CustomerCredentials;
import pages.HomePage;
import pages.KindlePage;
import pages.PaperWhite;
import pages.Product;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class SelectProduct {

	private WebDriver driver;
	private TestBase testbase;
	private Cart cart;
	private Checkout checkout;
	private ClosePopUp closepopup;
	private CustomerCredentials cust;
	private HomePage home;
	private KindlePage kindlepage;
	private PaperWhite paperwhite;
	private Product product;
	
  @Test
  public void BuyKindleProduct() throws InterruptedException {
	  boolean b;
	  
	  home.selectDepartment();
	  kindlepage.slectKindle();
	  paperwhite.getPaperWhite();
	  product.selectQuantity("2");
	  cart.addtoCart();
	  closepopup.removePopUp();
	  checkout.proceedtoCheckout();
	  b=cust.emailValid();
//	  Assert.assertTrue(b);
	  
  }
  
  @Parameters("browser")
  @BeforeClass
  public void initilization(String browser) throws IOException {
	  testbase = new TestBase();
	  driver= testbase.getInstance(browser);
	  home = new HomePage(driver);
	  paperwhite=new PaperWhite(driver);
	  kindlepage = new KindlePage(driver);
	  cart= new Cart(driver);
	  checkout= new Checkout(driver);
	  closepopup=new ClosePopUp(driver);
	  cust=new CustomerCredentials(driver);
	  product=new Product(driver);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver.get("http://www.amazon.ca");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
