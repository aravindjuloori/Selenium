package day22;




import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();    //to mximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement inputBox=driver.findElement(By.id("inputUsername"));
		String DefaultInputboxtext=inputBox.getDomProperty("placeholder"); 
		Assert.assertEquals(DefaultInputboxtext, "Username");
		
		WebElement inputBoxPassword=driver.findElement(By.name("inputPassword"));
		String passwordDefaultText=inputBoxPassword.getDomProperty("placeholder");
		Assert.assertEquals(passwordDefaultText, "Password");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Aravind");   // sending values to input box by using id locator
		driver.findElement(By.name("inputPassword")).sendKeys("sfqatest");  // using Name locator for the password box
		
				
		driver.findElement(By.className("signInBtn")).click();  //By className locator
		
		
		
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("All links in the webpage:" +allLinks.size());
		
		
	}

}
