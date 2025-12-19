package day27;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		
		//Fluent Wait declaration
		
		/*
		 * Wait<WebDriver> wait = new FluentWait() .withTimeout(Duration.ofSeconds(40))
		 * .pollingEvery(Duration.ofSeconds(3)) .ignoring(TimeoutException.class);
		 */
									

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		

	}

}
