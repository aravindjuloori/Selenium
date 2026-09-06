package day26;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethods {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Get Methods --- This methods can be accessed by driver instance on webpages

		// 1.get(url)-- open the url on the browser

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// 2.getTitle()- returns the title of the page
		String pageTitle = driver.getTitle(); // returns the title of the web page
		System.out.println("Title of the page is :" + pageTitle);

		// 3.getCurrenturl()-returns the url of the page
		String currenturl = driver.getCurrentUrl(); // it returns the current url
		System.out.println(currenturl);

		// 4.getPageSource()-returns the source code of the page
		// System.out.println(driver.getPageSource());

		// 5.getWindowHandle()- it will return the ID of the browser

		String windowid = driver.getWindowHandle();
		System.out.println("Window handle of single browser window " + windowid);

		// 6.getWindowHandles()- it will return the ID of the multiple browser windows

		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.id("visitUSOne")).click();

		Set<String> windowids = driver.getWindowHandles();
		System.out.println("Window ids of multiple browsers opened" + windowids);

		for (String value : windowids) {
			System.out.println(value);

		}

		// browser methods

		//driver.close();
		driver.quit();

	}

}
