package com.centric.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageSteps {

	public WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	
		
		

	}

	@After
	public void tearDown() {
		driver.quit();

	}

	@Given("^user is on Google Page$")
	public void user_is_on_Google_Page() {
		driver.get("https://www.google.com");
	}

	@When("^he search for \"([^\"]*)\"$")
	public void he_search_for(String companyName) {
		driver.findElement(By.name("q")).sendKeys(companyName);
		driver.findElement(By.name("btnK")).click();

		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys(companyName);
		driver.findElement(By.name("btnK")).click();
	}

}