/**
 * 
 */
package com.mercurytours.pom.pages;

import org.openqa.selenium.By;

import com.mercurytours.base.BaseTest;

/**
 * 
 */
public class Car_RentalsPage extends BaseTest {

	public Car_RentalsPage() {
		this.driver = driver;
	}

	By CarRental = By.xpath("//*[text()='Car Rentals']");

	By BackToHome = By.xpath("//*[@colspan='2']");

	public void carRental() {
		driver.findElement(CarRental).click();
	}

	public void backToHome() {
		driver.findElement(BackToHome).click();
	}

}
