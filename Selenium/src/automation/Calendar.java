package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
		//I will provide month and date  Jan 23 2021
		
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April")) {
			
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
			
		}
		
		
		
		List<WebElement> dates=driver.findElements(By.cssSelector(".day"));
		//grab the common attribute and loop through list
		int count=driver.findElements(By.cssSelector(".day")).size();
		
		for(int i=0;i<count;i++) {
			
			String text=driver.findElements(By.cssSelector(".day")).get(i).getText();
			
			if(text.equalsIgnoreCase("20")) {
				
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
			
			
		}
		
		
	}

}
