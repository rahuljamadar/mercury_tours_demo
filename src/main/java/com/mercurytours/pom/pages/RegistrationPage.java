package com.mercurytours.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mercurytours.base.BaseTest;


public class RegistrationPage extends BaseTest {
	
	public RegistrationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='REGISTER']")
	WebElement regLink;
	
	@FindBy(name="firstName")
	WebElement firstname;
	
	@FindBy(name="lastName")
	WebElement lastname;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="address1")
	WebElement address1;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="postalCode")
	WebElement postcode;
	
	@FindBy(name="country")
	WebElement country;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="confirmPassword")
	WebElement confirmpass;
	
	@FindBy(name="submit")
	WebElement submit;
	
	public void clickRegLink()
	{
		regLink.click();
	}
	
	public void Fname(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void Lname(String lname)
	{
		lastname.sendKeys(lname);
	}
	
	public void phone(String ph)
	{
		phone.sendKeys(ph);
	}
	
	public void userName(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void address1(String add)
	{
		address1.sendKeys(add);
	}
	
	public void city(String cy)
	{
		city.sendKeys(cy);
	}
	
	public void state(String st)
	{
		state.sendKeys(st);
	}
	
	public void postalcode(String pst)
	{
		postcode.sendKeys(pst);
	}
	
	public void setCountry(String cn) {
		Select drop= new Select(country);
		drop.selectByVisibleText(cn);
	}
	
	public void email(String em)
	{
		email.sendKeys(em);
	}
	
	public void password(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void confirmpassword(String cpass)
	{
		confirmpass.sendKeys(cpass);
	}
	
	public void submit()
	{
		submit.click();
	}

}
