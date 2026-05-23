package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector(".wikipedia-search-input")).sendKeys("selenium");
		driver.findElement(By.cssSelector("input.wikipedia-search-button")).click();
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
		System.out.println(allLinks.size());
		
		for(WebElement link:allLinks) {
			link.click();
		}
		
		Set<String> windowIds=driver.getWindowHandles();
		
		//Approach 1  convert set list to List
		
	List<String> windowList=new ArrayList<>(windowIds);
		System.out.println(windowList);
		
		for(String winId:windowList) {
			
			String title=driver.switchTo().window(winId).getTitle();
			
			if(title.equals("Selenium in biology - Wikipedia")||title.equals("Selenium (software) - Wikipedia")) {
				driver.close();
			}
		} 
		

	}

}
