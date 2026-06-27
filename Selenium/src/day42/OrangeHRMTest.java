package day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * 1.open the application
 * 2.test logo presence
 * 3.Login
 * 4.Close
 */

public class OrangeHRMTest {
	
	WebDriver driver;
	
	@Test(priority=1)
	public void openApp() {
		 driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(priority=2)
	public void testLogo() throws InterruptedException {
		Thread.sleep(4000);
		Boolean logostatus=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Logo displayed "+logostatus);
		Assert.assertTrue(logostatus);
		
	}
	
	@Test(priority=3)
	public void login() {
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	
	@Test(priority=4)
	public void closeApp() {
		driver.quit();
	}
 
}
