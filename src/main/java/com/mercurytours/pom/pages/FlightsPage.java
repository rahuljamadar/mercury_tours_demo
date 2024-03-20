package com.mercurytours.pom.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.mercurytours.base.BaseTest;

public class FlightsPage extends BaseTest {

	public void fligh() {
		WebElement flight = driver.findElement(By.xpath("//a[text()='Flights']"));
		flight.click();
	}

	public void flightDetails() {
		WebElement flight = driver.findElement(By.xpath("//a[text()='Flights']"));
		flight.click();

		driver.findElement(By.xpath("//input[@value='roundtrip']")).click();

		// passenger details
		List<WebElement> passenger = driver.findElements(By.xpath("//select[@name='passCount']"));
		System.out.println(passenger.size());

		Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		dropdown.selectByValue("2");

		// Departing from
		List<WebElement> depar = driver.findElements(By.xpath("//select[@name='fromPort']"));
		System.out.println(depar.size());

		Select sydney = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		sydney.selectByVisibleText("Sydney");

		// select month
		List<WebElement> month = driver.findElements(By.xpath("//select[@name='fromMonth']"));
		System.out.println(month.size());

		Select mn = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
		mn.selectByVisibleText("March");

		// select date
		List<WebElement> day = driver.findElements(By.xpath("//select[@name='fromDay']"));
		System.out.println(day.size());

		Select dy = new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
		dy.selectByVisibleText("14");

		// select arriving in
		List<WebElement> arr = driver.findElements(By.xpath("//select[@name='toPort']"));
		System.out.println(arr.size());

		Select s = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		s.selectByVisibleText("Paris");

		// select returning month
		List<WebElement> retur = driver.findElements(By.xpath("//select[@name='toMonth']"));
		System.out.println(retur.size());

		Select rt = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
		rt.selectByVisibleText("April");

		// select returning date
		List<WebElement> returndate = driver.findElements(By.xpath("//select[@name='toDay']"));
		System.out.println(returndate.size());

		Select rdate = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
		rdate.selectByVisibleText("17");

		// select service class
		driver.findElement(By.xpath("//input[@value='Business']")).click();

		// select Airlines
		List<WebElement> airlines = driver.findElements(By.xpath("//select[@name='airline']"));
		System.out.println(airlines.size());

		Select air = new Select(driver.findElement(By.xpath("//select[@name='airline']")));
		air.selectByVisibleText("Blue Skies Airlines");

		// click on submit
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();

	}
}
