package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserFactory {

	static WebDriver driver;

	public static WebDriver startBrowser() {
	// Set Chrome Driver Properties
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\harke\\class 2021\\checkbox\\cdriver\\chromedriver.exe");
	// Create ChromeDriver object and launch chrome browser
	WebDriver driver = new ChromeDriver();
	driver.get("https://exa.ddi-web.com/DDI/login");
	// return the driver to the test class
	return driver;
	
	}
}

	
	
