package config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class TestBase {

	public static Logger logger = Logger.getLogger(TestBase.class);
	private WebDriver driver;
	public Properties p;
	
	public WebDriver getInstance(String browser) throws IOException {
	
		String loc = System.getProperty("user.dir");
		logger.info("Getting user directory!");
		System.out.println(loc);
		p=new Properties();
		String propertyFilePath = loc+"\\src\\test\\resources\\configuration.properties";
		Reader reader = new BufferedReader(new FileReader(propertyFilePath));
		p.load(reader);
	if(browser.equalsIgnoreCase("chrome")) 
	{
		    logger.info("Initializing chrome driver.");
			System.setProperty("webdriver.chrome.driver",loc+p.getProperty("chromedriver"));
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notification");
			driver =  new ChromeDriver(option);
	}else if(browser.equalsIgnoreCase("firefox")) {
		logger.info("Initializing firefox driver.");
		System.setProperty("webdriver.gecko.driver", loc+p.getProperty("firefoxdriver"));
		FirefoxOptions option=new FirefoxOptions();
		option.addArguments("-marionette");
		driver =  new FirefoxDriver(option);
	}else {
		System.out.println("Browser not defined!");
	}
	
	
	//driver.get("http://amazon.ca");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return driver;
	}
}
