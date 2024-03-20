package com.mercurytours.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mercurytours.base.BaseTest;
import com.mercurytours.pom.pages.SignOnPage;
import com.mercurytours.utility.ListenerTest;


@Listeners(ListenerTest.class)
public class SignOnTest extends BaseTest {
	public static Logger log = LogManager.getLogger(BaseTest.class);
	SignOnPage sp = new SignOnPage();

	@BeforeMethod
	public void setup() {
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1, description = "Verify user login details")
	public void signIn() {
		log.info("Enter username");
		sp.userName(pro.getProperty("username"));
		log.info("Enter password");
		sp.password(pro.getProperty("password"));

		sp.submit();
		sp.wait(2000);
		String expTitle = "Login Successfully";
		Assert.assertEquals(sp.getTilte(), expTitle);
		log.info("Verified login successful title");

	}

	@Test(priority = 2, description = "Verify application logo")
	public void VerifyLogo() {
		boolean result = sp.validateLogo();
		Assert.assertTrue(result);
		log.info("Verified logo is displayed");
	}

	@Test(testName="VerifyTitle", priority = 3, description = "Verify app title")
	public void VerifyTitle() {
		String actTitle = sp.validateTitle();
		Assert.assertEquals(actTitle, "Login: Mercury Tours");
		log.info("Verified home page title");
	}

}
