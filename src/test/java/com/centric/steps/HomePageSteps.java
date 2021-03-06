package com.centric.steps;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageSteps {

	public WebDriver driver;

	@Given("^user is on Google Page$")
	public void user_is_on_Google_Page() {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.merge(capabilities);
		try {
			if (System.getProperty("HUB_HOST") != null) {
				String host = System.getProperty("HUB_HOST");
				driver = new RemoteWebDriver(new URL(host), capabilities);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.get("https://www.google.com");
	}

	@When("^he search for \"([^\"]*)\"$")
	public void he_search_for(String companyName) {
		driver.findElement(By.name("q")).sendKeys(companyName);
		driver.findElement(By.name("btnK")).click();


		driver.quit();
	}

}