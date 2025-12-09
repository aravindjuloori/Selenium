package pavan;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClosingSpecificBrowserwindowDay28 {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("visitUsTwo")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();
		
		for(String winId:windowIDs) {
			
			String title=driver.switchTo().window(winId).getTitle();
			System.out.println(title);
			
			if(title.equals("Rahul Shetty Academy | Master AI & Automation Testing")) {
				driver.close();
			}
			
		}
	}

}
