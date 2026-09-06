package day28;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);

		// driver.get("https://rahulshettyacademy.com/locatorspractice/"); // accepts
		// url only in the string format

		// navigate().to() -- it will accept the url in the 1.String format 2.URL format

		// driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		// 1.String format

		URL myurl = new URL("https://rahulshettyacademy.com/locatorspractice/"); // 2.URL object format

		driver.navigate().to(myurl);
		driver.manage().window().maximize();

		driver.get("https://www.google.com");

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().refresh();

	}

}
