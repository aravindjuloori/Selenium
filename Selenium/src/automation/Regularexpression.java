package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regularexpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'log')]")).sendKeys("Helloworld");
		driver.findElement(By.cssSelector("input#password")).sendKeys("world");
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
	}

}
