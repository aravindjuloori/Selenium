package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		// Invoking the browser

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize(); // it will maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // implicit wait to overcome sync issues
		

		driver.findElement(By.id("inputUsername")).sendKeys("Aravind"); // sending values to input box by using id															// locator
		
		driver.findElement(By.name("inputPassword")).sendKeys("hello123"); // using Name locator for the password box

		// Locate the input field
		WebElement inputBox = driver.findElement(By.id("inputUsername"));

		// Get default text using getAttribute("value")
		String defaultText = inputBox.getDomProperty("placeholder");
		System.out.println("Default username text is : " + defaultText);

		// Locate the input field
		WebElement inputBoxpasswprd = driver.findElement(By.name("inputPassword"));

		// Get default text using getAttribute("value")
		String defaultText1 = inputBoxpasswprd.getDomProperty("placeholder");
		System.out.println("Default password text is : " + defaultText1);

		driver.findElement(By.className("signInBtn")).click(); /// By Class Name locator

		// CSS syntax
		// 1.tagname.classname
		// 2.tagName#id
		// 3.tagName[attribute='value']

String loginErrordetails=driver.findElement(By.cssSelector("p.error")).getText();//By CSS selector
	
//String loginErrordetails = driver.findElement(By.cssSelector("p[class='error']")).getText(); // By CSS selector

		System.out.println("Login error details is displayed here: " + loginErrordetails);
		
		driver.findElement(By.linkText("Forgot your password?")).click();  //Link Text
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("aravind");  //customized xpath
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("aravind.juloori@gmail.com");  //CSS selector
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();  //xpath with index concept
		
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Bhanvni@gmail.com");  //css selector with index concept
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("123232");   //xpath parenttagname/child tagname
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();   //.classname 
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());  //css parenttagname childtagname
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click(); //parent and child traverse
		
		
		driver.findElement(By.id("inputUsername")).sendKeys("Aravind");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		//driver.quit();
		

	}

}
