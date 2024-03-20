package com.mercurytours.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.mercurytours.base.BaseTest;

public class SignOnPage extends BaseTest {

	public void userName(String un)
	{
		WebElement e=driver.findElement(By.name("userName"));
		e.click();
		e.sendKeys(un);
	}
	
	public void password(String pwd)
	{
		WebElement password=driver.findElement(By.name("password"));
		password.click();
		password.sendKeys(pwd);
	}
	
	public void submit()
	{
		 driver.findElement(By.name("submit")).click();
		
	}
	
	public String getTilte()
	{
		return driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText();
	}
	
	public void wait(int time)
	{
		try {
			Thread.sleep(time);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	
	public boolean validateLogo()
	{
		return driver.findElement(By.xpath("//div[@class='col-md-2 header-section']")).isDisplayed();

	}
	
	public String validateTitle()
	{
		String mytitle = driver.getTitle();
		return mytitle;
	}
	

}
