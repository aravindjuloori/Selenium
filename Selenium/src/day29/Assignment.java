package day29;

import java.time.Duration;
import java.util.List;

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
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		List<WebElement> chkbox=driver.findElements(By.xpath("//table[@id='productTable']//input[@type='checkbox']"));
		System.out.println(chkbox.size());
		
		for(int i=0;i<chkbox.size();i++) {
			chkbox.get(i).click();
		}
	}

}
