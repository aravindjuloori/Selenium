package day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemoAssignment {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();    //to mximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total No. of links in this page is:" + allLinks.size());
		
		int links=allLinks.size();
		
		for(int i=0;i<links;i++) {
			String linkname =driver.findElements(By.tagName("a")).get(i).getDomProperty("href");
			System.out.println(linkname);
		}
		
		
		  List<WebElement> allImages=driver.findElements(By.tagName("img"));
		  System.out.println("toatal no of images in this page is "+allImages.size());
		  
		  
		  driver.findElement(By.partialLinkText("1520")).click(); //clicking the element using partiallink text
	
		 
	}

}
