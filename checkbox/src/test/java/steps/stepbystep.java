package steps;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;

import util.browserFactory;
import util.utility;

public class stepbystep {

	WebDriver driver;

	@Given("^i am on login page$")
	public void a_valid_user() {
		driver = browserFactory.startBrowser();
	}

	@When("^user click on checkbox of hippa notice$")
	public void user_goes_to_EXA_Login_site() {

		boolean checkboxStatus = driver.findElement(By.id("chkHipaaPrivacy")).isSelected();
		if (!checkboxStatus) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.querySelector('form.login-form input#chkHipaaPrivacy + label').click()");
		}
	}

	@Then("^verify checkbox hippa is checked$")
	public void take_screenshot_of_checkbox() throws IOException {

		Assert.assertEquals(true, driver.findElement(By.id("chkHipaaPrivacy")).isSelected());

		String date = utility.getCurrentDate();

		utility.takeUIScrenshot(date, driver);
		driver.close();
	}

}
