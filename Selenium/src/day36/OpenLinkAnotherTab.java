package day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenLinkAnotherTab {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement reglink=driver.findElement(By.xpath("//button[@id='visitUsTwo']"));
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(reglink).keyUp(Keys.CONTROL).perform();
		
		Set<String> winids=driver.getWindowHandles();
		
		//converting to list as set will not support the index concept
		List<String> win=new ArrayList<>(winids);
		driver.switchTo().window(win.get(1));
		System.out.println(driver.getTitle());
		
		//switching back to main window
		driver.switchTo().window(win.get(0));
		System.out.println(driver.getTitle());
		
	}

}
