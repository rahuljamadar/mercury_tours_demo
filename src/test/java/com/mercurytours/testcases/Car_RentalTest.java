/**
 * 
 */
package com.mercurytours.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mercurytours.base.BaseTest;
import com.mercurytours.pom.pages.Car_RentalsPage;
import com.mercurytours.utility.ListenerTest;

/**
 * 
 */
@Listeners(ListenerTest.class)
public class Car_RentalTest extends BaseTest {
	public static Logger log = LogManager.getLogger(BaseTest.class);
	Car_RentalsPage cr = new Car_RentalsPage();

	@BeforeMethod
	public void setup() {
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void VerifyCarRental() {
		cr.carRental();
		log.info("click on car rental link");
	}
	
	@Test
	public void VerifyBackToHome()
	{
		cr.backToHome();
		log.info("Click on back to homepage button");
	}

}
