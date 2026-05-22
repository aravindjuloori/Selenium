package day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo {
	
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider="dp")
	void testLogin(String email,String password) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		Boolean status=driver.findElement(By.xpath("//span[normalize-space()='My Account']")).isDisplayed();
		
		if(status==true) {
			driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
			driver.findElement(By.xpath("(//a[normalize-space()='Logout'])[1]")).click();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
		
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
	
	@DataProvider(name="dp",indices= {0,1})
	public Object[][] loginData() {
		
		Object data[][]= {
							{"aravind.juloori@gmail.com","test@123"},
							{"aravind.juloori@gmail.com","test@123"},
							{"aravind.juloori@gmail.com","test@123"}
					
		};
		return data;
		
	}

}
