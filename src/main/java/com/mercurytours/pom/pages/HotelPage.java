/**
 * 
 */
package com.mercurytours.pom.pages;

import org.openqa.selenium.By;
import com.mercurytours.base.BaseTest;

/**
 * 
 */
public class HotelPage extends BaseTest {

	public HotelPage() {
		this.driver = driver;
	}

	By HotelBtn = By.xpath("//*[text()='Hotels']");

	By BackToHome = By.xpath("//*[@colspan='2']");

	public void clickHotelBtn() {
		driver.findElement(HotelBtn).click();
	}

	public void backHome() {
		driver.findElement(BackToHome).click();
	}

}
