package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\\\softwares\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		
		//driver.findElement(By.className("input r4 wide mb16 mt8 username")).sendKeys("Hello");
		
		driver.findElement(By.id("username")).sendKeys("salesforce");
		driver.findElement(By.name("pw")).sendKeys("salesforcepassword");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		driver.close();
		
	}

}
