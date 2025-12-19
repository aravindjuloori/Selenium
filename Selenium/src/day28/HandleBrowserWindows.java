package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindows {
	
	
	public static void main(String args[]) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("visitUsTwo")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();
		
		//Approach 1 - Convert the set collection to list collection
		
		/*
		 * List<String> windowlist=new ArrayList(windowIDs);
		 * 
		 * String parentID=windowlist.get(0); 
		 * String childID=windowlist.get(1);
		 * 
		 * //switch to child window 
		 * driver.switchTo().window(childID);
		 * System.out.println(driver.getTitle());
		 * 
		 * 
		 * //switch to parent window 
		 * driver.switchTo().window(parentID);
		 * System.out.println(driver.getTitle());
		 */
		
		
		//Approach 2
		for(String winId:windowIDs) {
			
			String title=driver.switchTo().window(winId).getTitle();
			
			if(title.equals("Rahul Shetty Academy | Master AI & Automation Testing")) {
				System.out.println(driver.getCurrentUrl());
			}
		}
		
		
		
		
	}

}
