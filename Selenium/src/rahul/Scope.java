package rahul;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		//Give me the count of links in a web page
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Get the links from the footer section
		
		WebElement footerDriver=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		
			System.out.println(footerDriver.findElements(By.tagName("a")).size());
			
			//first column links in the footer
			WebElement columndriver=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
			
			int columnsize=columndriver.findElements(By.tagName("a")).size();
			
			//Click on each link and check windows are opened
			
			for(int i=1;i<columnsize;i++) {
				String clickonLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
				
				columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
				Thread.sleep(5000L);
			}
				
				  Set<String> handle=driver.getWindowHandles();
				  
				  Iterator<String> it=handle.iterator(); while(it.hasNext()) {
				  driver.switchTo().window(it.next()); System.out.println(driver.getTitle());
				  
				  
				  }
				 
			}
			
		
	}


