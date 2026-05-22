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
		
		Set<String> windowIds=driver.getWindowHandles();
		System.out.println(windowIds);
		
		//Approach 1 - Convert the set collection to list collection
		
		/*
		 * List<String> windowList=new ArrayList<>(windowIds);
		 *  String parentId=windowList.get(0); 
		 *  String chlidId=windowList.get(1);
		 * 
		 * //switch to child window 
		 * driver.switchTo().window(chlidId);
		 * System.out.println(driver.getTitle());
		 * 
		 * //switching to parent window 
		 * driver.switchTo().window(parentId);
		 * System.out.println(driver.getTitle());
		 */
		
		//Approach2
		
		for(String winId:windowIds) {
			String title=driver.switchTo().window(winId).getTitle();
			if(title.equals("Rahul Shetty Academy | QA Automation, Playwright, AI Testing & Online Training")) {
				System.out.println(driver.getCurrentUrl());
			}	
		}
		
		
		 
	}

}
