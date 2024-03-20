package com.mercurytours.actiondriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.mercurytours.base.BaseTest;

public class Action {
	
	public static void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) { 
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", ele);
}

public static void click(WebDriver ldriver, WebElement locatorName) {
	
	Actions act = new Actions(ldriver);
	act.moveToElement(locatorName).click().build().perform();
}

public static boolean type(WebElement ele, String text)
{ 
	boolean flag = false;
	try {
		flag= ele.isDisplayed();
		ele.clear();
		ele.sendKeys(text);
		flag = true;
	} catch (Exception e) {
		System.out.println("Location not found");
		flag = false;
	}  finally {
		if (flag) {
			System.out.println("Successfully entered value");
		}
		else {
			System.out.println("Unable to enter value");
		}
		return flag;
	}
	}
public static boolean findElement(WebDriver ldriver, WebElement ele) {
	boolean flag= false;
	try {
	ele.isDisplayed();
	flag= true;
	} catch (Exception e) {
		flag = false;
	} finally {
		if(flag) {
			System.out.println("Successfully found element");
		}
		else {
			System.out.println("Unable to locate element");
		}
	}
	return flag;
}
	
public static boolean isDsiaplyed(WebDriver ldriver, WebElement ele) 
{
	boolean flag= false;
	flag =findElement(ldriver, ele);
		if (flag) {
			flag= ele.isDisplayed();
		if(flag) {
			System.out.println("The element is displayed");
		} else {
			System.out.println("The element is not displayed");
		}
		}else {
			System.out.println("Not displayed");
		}
		return flag;
	}

public static boolean isSelected(WebDriver ldriver, WebElement ele)
{
	boolean flag= false;
	flag = findElement(ldriver, ele);
	if (flag) {
		flag = ele.isSelected();
		if(flag) {
			System.out.println("The element is selected");
		} else {
			System.out.println("The element is not selected");
		}
	} else {
		System.out.println("Not selected");
	}
	 return flag;
}

public static boolean isEnabled(WebDriver ldriver, WebElement ele)
{
	boolean flag = false;
	flag = findElement(ldriver, ele);
	if(flag) {
		flag = ele.isEnabled();
		if(flag) {
			System.out.println("The element is enabled");
	} else {
		System.out.println("The element is not enabled");
		}
	} else { 
		System.out.println("No enabled");
	}
	return flag;
}

public static boolean selectByVisibleText(String visibletext, WebElement ele)
{
	boolean flag = false;
	try {
		Select s = new Select(ele);
		s.selectByVisibleText(visibletext);
		flag = true;
		return true;
	}
	catch (Exception e) {
		return false;}
	finally {
	if (flag) {
		System.out.println("Option selected by visibletext"); }
	else {
		System.out.println("Option is not selected by visibleText");
	     }
	}
	
	}
}





