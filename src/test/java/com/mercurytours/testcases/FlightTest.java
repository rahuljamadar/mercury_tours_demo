package com.mercurytours.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mercurytours.base.BaseTest;
import com.mercurytours.pom.pages.FlightsPage;
import com.mercurytours.utility.ListenerTest;

@Listeners(ListenerTest.class)
public class FlightTest extends BaseTest {
	public static Logger log = LogManager.getLogger(BaseTest.class);

	@BeforeMethod
	public void setup() {
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(description = "Verify passenger flight details information")
	public void flightInfo() {
		new FlightsPage().flightDetails();
		log.info("Verified click on flight info");
	}
}
