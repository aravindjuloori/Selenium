package org.rahulshettyacademy;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.rahulshettyAcademy.pageObjects.FormPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {

	public AndroidDriver driver;
	public AppiumDriverLocalService service;
    public FormPage formPage;

	@BeforeClass
	public void configureAppium() throws MalformedURLException {
		//Starting Appium server programmatically using AndroidServiceBuilder
		service = new AppiumServiceBuilder()
				.withAppiumJS(new File(
						"C:\\Users\\Aravind\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();

		
			service.start(); // start appium server

		// Setting the capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Aravind Device");
		options.setPlatformName("Android");
		//options.setApp("C:\\Users\\Aravind\\git\\Appium\\Appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		options.setApp("C:\\Users\\Aravind\\git\\Appium\\Appium\\src\\test\\java\\resources\\General-Store.apk");
		
		// Android device or ios device
		// appium code --> appium server
		URL appiumServerUrl = URI.create("http://127.0.0.1:4723").toURL();
		driver = new AndroidDriver(appiumServerUrl, options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        formPage=new FormPage(driver);

	}


	@AfterClass
	public void tearDown() {
		driver.quit();
		service.stop();

	}

}
