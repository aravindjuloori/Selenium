package basics;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> windows=driver.getWindowHandles(); //parent and child window handle ids
		
		Iterator<String> it=windows.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		
	String text=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim();
	
	String emailid=text.split(" ")[0].trim();
	System.out.println(emailid);
	
	driver.switchTo().window(parentid);
	driver.findElement(By.id("username")).sendKeys(emailid);
		
		
	
	
		
		
		

	}

}
