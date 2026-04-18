package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
	
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));   //Declaration
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		
		WebElement unameTextBox=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='inputUsername']")));
		unameTextBox.sendKeys("Aravind");
		
		WebElement passwordTextBox=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='inputPassword']")));
		passwordTextBox.sendKeys("sfqatest");
		
		
		WebElement signinbutton=mywait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class*='signInBtn']")));
		signinbutton.click();
		
	}

}
