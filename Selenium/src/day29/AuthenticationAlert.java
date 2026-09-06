package day29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationAlert {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);

		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		// https://the-internet.herokuapp.com/basic_auth
		driver.manage().window().maximize();

	}

}
