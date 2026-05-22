package day46;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(day46.MyListner.class)
public class OrangeHRMTest {
	WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 Thread.sleep(4000);
	}
	@Test(priority=1)
	void testlogo() {
		
		boolean logoStatus=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertTrue(logoStatus);
	}
	
	@Test(priority=2)
	void testTitle(){
	
		String pageTitle=driver.getTitle();
		Assert.assertEquals(pageTitle,"OrangeHRM");
	}
	
	
	@Test(priority=3)
	void testUrl() {
		String pageURL=driver.getCurrentUrl();
		Assert.assertEquals(pageURL,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
