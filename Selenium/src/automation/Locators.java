package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\\\softwares\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	//	driver.findElement(By.id("email")).sendKeys("Selenium");
		//driver.findElement(By.name("pass")).sendKeys("12345");
	//	driver.findElement(By.className("inputtext._55r1._6luy")).sendKeys("Hello");
	//	driver.findElement(By.cssSelector(".inputtext._55r1._6luy")).sendKeys("Hello");
	//	driver.findElement(By.linkText("Forgotten password?")).click();
		
		
		//driver.findElement(By.cssSelector("#email")).sendKeys("Hello");
		driver.findElement(By.cssSelector(".inputtext._55r1._6luy")).sendKeys("Hello");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
	}

}
