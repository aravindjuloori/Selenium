package rahul;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

public class Locators2 {
	
	public static void main(String args[]) throws InterruptedException {
		
	String name="aravind";
	
	  WebDriverManager.chromedriver().setup(); 
	  WebDriver driver = new ChromeDriver();
	 
	
	/*
	 * WebDriverManager.firefoxdriver().setup(); WebDriver driver = new
	 * FirefoxDriver();
	 */
	
	
	
	String password=getPassword(driver);
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.manage().window().maximize(); // it will maximize the browser
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // implicit wait to overcome sync issues
	

	driver.findElement(By.id("inputUsername")).sendKeys(name); // sending values to input box by using id															// locator
	driver.findElement(By.name("inputPassword")).sendKeys(password); // using Name locator for the password box
	driver.findElement(By.className("signInBtn")).click();
	
	
	Thread.sleep(2000);
	String successText=driver.findElement(By.tagName("p")).getText();
	
	System.out.println("Successfully login test validation:" +successText);
	Assert.assertEquals(successText,"You are successfully logged in.");
	
	String actualtext=driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
	
	Assert.assertEquals(actualtext,"Hello "+name+",");
	
	driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	
	

}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Forgot your password?")).click();  //Link Text
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); 
		
		String passwordText=driver.findElement(By.cssSelector("form p")).getText();
		
		String[] passwordArray=passwordText.split("'");
		//[0] -left side -Please use temporary password '
		//[1] -right side -rahulshettyacademy' to Login.
		
		System.out.println("leftside index value is :" +passwordArray[0]);
		String password=passwordArray[1].split("'")[0];
		
		return password;
		
		
		
	}
}
