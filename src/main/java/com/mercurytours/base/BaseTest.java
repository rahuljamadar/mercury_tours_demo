package com.mercurytours.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static Properties pro;
	public static WebDriver driver;
	public static Logger log = LogManager.getLogger(BaseTest.class);

	@BeforeTest
	public void loadConfig() throws IOException {

		pro = new Properties();
		FileInputStream fis = new FileInputStream(
			"C:/Users/rahul.jamadar_mplify/eclipse-workspace/mercury_tours_demo/Configuration/Config.properties");
		pro.load(fis);

	}

	public static void launchApp() {
//		ExtentReports extent = new ExtentReports();
//		ExtentSparkReporter spark = new ExtentSparkReporter("Extentreports.html");
//		extent.attachReporter(spark);

		log.info("----- Launching Application -----");
		WebDriverManager.firefoxdriver().setup();
		String browserName = pro.getProperty("browser");

		if (browserName.equalsIgnoreCase("Firefox")) {
			log.info("----- Launching: " + browserName + "-----");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("Chrome")) {
			log.info("----- Launching: " + browserName + "-----");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.contains("IE")) {
			log.info("----- Launching: " + browserName + "-----");
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		driver.get(pro.getProperty("url"));
//    	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

}
