package pavan;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalCommandsDay28 {

	public static void main(String[] args) throws MalformedURLException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		//driver.get("https://rahulshettyacademy.com/locatorspractice/");  // accepts url only in the string format
		
		//navigate().to() -- it will accept the url in the 1.String format 2.URL format
		
		//driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/"); 
		
		
		URL myurl=new URL("https://rahulshettyacademy.com/locatorspractice/");
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
