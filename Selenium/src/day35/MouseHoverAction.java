package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverAction {

	public static void main(String[] args) {
	
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--incognito");
			
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver(options);
			
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement signin=driver.findElement(By.xpath("//div[@id='nav-link-accountList']"));
			WebElement signinBtn=driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']/a/span"));
			
			Actions act=new Actions(driver);
//			act.moveToElement(signin).moveToElement(signinBtn).click().build().perform();
			
			act.moveToElement(signin).moveToElement(signinBtn).click().perform();
	}

}
