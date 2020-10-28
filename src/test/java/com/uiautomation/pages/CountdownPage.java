package com.uiautomation.pages;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class CountdownPage extends LandingPage {

	public CountdownPage(WebDriver driver) {
		super(driver);
	}

	public Boolean isCounterVisible() {
		String CounterText = driver.findElement(By.id("progressText")).getText();
		if (CounterText.isEmpty()) {
			return false;
		}
		return true;
	}

	public void validatetimer(int time) throws InterruptedException {
		int i = time-2;
		String currentText;
		String expectedText;
		for (int j = 1; j < time-2; j++) {
			currentText = driver.findElement(By.id("progressText")).getText();
			expectedText = i + " seconds";
			if (currentText.equalsIgnoreCase(expectedText)) {
				System.out.println(currentText + " matches " + expectedText);
			}else {
				System.out.println(currentText + " doesn't match " + expectedText);
			}
			Thread.sleep(1000);
			i--;
		}
	}
}
