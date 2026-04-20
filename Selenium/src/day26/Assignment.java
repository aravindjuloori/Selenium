package day26;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) {
	
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
			String pageTitle=driver.getTitle();		
			System.out.println("Title of the page is : " +pageTitle);
			
			
			String currentUrl=driver.getCurrentUrl();
			System.out.println("Current URL of the page is :" +currentUrl);
			
			//System.out.println(driver.getPageSource());
			
			String windowid=driver.getWindowHandle();
			System.out.println("Windowid of the browser is :" +windowid);
			
			
			driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();
			
			Set<String> windowids=driver.getWindowHandles();
			System.out.println(windowids);
			
			for(String value:windowids) {
				System.out.println(value);
			}
			
			
			//driver.close();
			driver.quit();
			
			
			
			

	}

}
