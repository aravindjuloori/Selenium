package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		Thread.sleep(2000);
		
		
		Alert myAlert=mywait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(myAlert.getText());
		myAlert.accept();

	}

}
