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
import com.mercurytours.pom.pages.HotelPage;
import com.mercurytours.utility.ListenerTest;

/**
 * 
 */
@Listeners(ListenerTest.class)
public class HotelPageTest extends BaseTest {
	public static Logger log = LogManager.getLogger(BaseTest.class);
	public HotelPage hp = new HotelPage();

	@BeforeMethod
	public void setup() {
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(description = "Verify hotels click info page")
	public void verifyHotelPage() {
		hp.clickHotelBtn();
		log.info("Verified click on hotel page");
	}

	@Test(description = "Verify click on back to home button")
	public void verifyBackToHome() {
		hp.backHome();
		log.info("Verified click on back to home page button");
	}

}
