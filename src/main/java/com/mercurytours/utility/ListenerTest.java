package com.mercurytours.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.mercurytours.base.BaseTest;

public class ListenerTest extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
      

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("The name of testcase passed is :" + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		String s=result.getName();
		String time=new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
		System.out.println("--->"+s);
		TakesScreenshot t = ((TakesScreenshot) driver);

		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File dcs=new File("C:\\Users\\rahul.jamadar_mplify\\eclipse-workspace\\mercury_tours_demo\\ScreenShots"+s+"-"+time+".png");

		try {
			FileUtils.copyFile(srcFile, dcs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot capture successfully");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The name of testcase passed is :" + result.getName());
	}
}
