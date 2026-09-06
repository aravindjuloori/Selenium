package day35;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickAction {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement rightclk = driver.findElement(By.cssSelector(".context-menu-one.btn.btn-neutral"));

		Actions act = new Actions(driver);
		// Right click
		act.contextClick(rightclk).build().perform();

		// click on the copy
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();

		// close the alert box
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();

	}

}
