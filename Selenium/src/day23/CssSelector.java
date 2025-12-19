package day23;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) {
	
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//tagName#id
		
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		//tagName.classname
		
		//driver.findElement(By.cssSelector("input.search-box-text.ui-autocomplete-input")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");
		
		//Tagname and attribute
		
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
		
		//TagName class and attribute
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirts");
		
		//By using regular expression
		//driver.findElement(By.cssSelector("input[placeholder*='Search']")).sendKeys("T-shirts");
		

	}

}
