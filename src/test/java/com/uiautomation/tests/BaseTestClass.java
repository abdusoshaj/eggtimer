package com.uiautomation.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import com.uiautomation.framework.driver.DriverFactory;

import org.testng.annotations.BeforeMethod;

public class BaseTestClass {

	public WebDriver driver;

	public String browser;

	@BeforeMethod(alwaysRun = true)
	public void setUp() throws Exception {
		browser = "Chrome";
		this.driver = new DriverFactory().createDriver(browser);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
}