package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Frame1
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5); // switch to frame1

		driver.findElement(By.linkText("https://a9t9.com")).click();

		// driver.switchTo().frame(0);

		Boolean bool = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(bool);

	}

}
