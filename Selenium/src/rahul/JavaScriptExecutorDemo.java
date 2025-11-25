package rahul;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// Set up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        
        WebDriver driver=new ChromeDriver();
		
		
		//Give me the count of links in a web page
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
		
		

	}

}
