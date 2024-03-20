package com.mercurytours.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mercurytours.base.BaseTest;
import com.mercurytours.pom.pages.RegistrationPage;

public class RegistrationTest extends BaseTest {
	
	@BeforeMethod
	public void setUp()
	{
		launchApp();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void Register()
	{
		RegistrationPage Reg= new RegistrationPage();
		
		Reg.clickRegLink();
		Reg.Fname("Rahul");
		Reg.Lname("Patil");
		Reg.userName("rahul.jamadar");
		Reg.email("rahul.jamadar@gmail.com");
		Reg.address1("Sargasan Gandhinagar gujarat");
		Reg.city("Gandhinagar");
		Reg.setCountry("country");
		Reg.phone("1234567890");
		Reg.postalcode("382421");
		Reg.state("Guajarat");
		Reg.password("rahul@123");
		Reg.confirmpassword("rahul@123");
		Reg.submit();
		
		if(driver.getPageSource().contains("Thanks you for registering"))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
	}

}
