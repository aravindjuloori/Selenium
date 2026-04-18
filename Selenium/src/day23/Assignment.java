package day23;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

}
