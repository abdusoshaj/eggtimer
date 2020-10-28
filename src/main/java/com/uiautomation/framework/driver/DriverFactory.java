package com.uiautomation.framework.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	private static final String SELENIUM_PATH = "./src/main/resources/";

	public WebDriver createDriver(String browserName) throws Exception {

		if (browserName.equalsIgnoreCase("chrome"))
			return createChromeDriver();

		throw new Exception(browserName + " is not a valid browser name!");

	}

	private WebDriver createChromeDriver() {
		System.setProperty("webdriver.chrome.driver", SELENIUM_PATH + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
