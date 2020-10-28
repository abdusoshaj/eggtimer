package com.uiautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public void openLandingpage() {
		driver.get("https://e.ggtimer.com/");
		System.out.println("Launched e.ggtimer.com");
	}

	public void settimerinseconds(String timeinseconds) throws InterruptedException {
		WebElement inputfield = driver.findElement(By.id("start_a_timer"));
		inputfield.clear();
		inputfield.sendKeys(timeinseconds);
		driver.findElement(By.id("timergo")).click();
		System.out.println("Timer started for "+ timeinseconds);
	}
}
