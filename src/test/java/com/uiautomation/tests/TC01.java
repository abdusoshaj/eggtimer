package com.uiautomation.tests;

import org.testng.annotations.Test;

import com.uiautomation.pages.CountdownPage;
import com.uiautomation.pages.LandingPage;

public class TC01 extends BaseTestClass {

	@Test(groups = { "high" })
	public void verifyCountdownTimer() {
		try {
			// Step1
			CountdownPage countdownpage = new CountdownPage(this.driver);
			LandingPage landingPage = new LandingPage(this.driver);
			landingPage.openLandingpage();
			// Step2
			landingPage.settimerinseconds("25 seconds");
			countdownpage.validatetimer(25);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}