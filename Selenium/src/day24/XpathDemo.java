package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--incognito");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		//driver.get("https://demo.opencart.com");
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 //xpath with single attribute
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Aravind");   // //tagname[@attribute='value']
		
		 //xpath with multiple attributes
		//driver.findElement(By.xpath("//input[@name='inputPassword'][@placeholder='Password']")).sendKeys("hello123");
		
		//xpath with and attibute
		//driver.findElement(By.xpath("//input[@name='inputPassword' and @placeholder='Password']")).sendKeys("hellow123");
		
		//xpath with or attribute
		
		driver.findElement(By.xpath("//input[@name='inputPassword' or @placeholder='password']")).sendKeys("hellow123");
		
		//with inner text
		
		//driver.findElement(By.xpath("//button[text()='Sign In']")).click();   // tagname[text()='value']
		
		//with contains
		
		//driver.findElement(By.xpath("//button[contains(@class,'Btn')]")).click();
		
		//with starts-with 
		driver.findElement(By.xpath("//button[starts-with(@class,'sub')]")).click();
		
	 System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	 
	
	 
		
		
		
		
		
		

	}

}
