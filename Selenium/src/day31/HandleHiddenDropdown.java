package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleHiddenDropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Login to the application
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		//Clicking on PIM
		
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		//Clicking on the dropdown
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[2]")).click();
		
		Thread.sleep(5000);
		//Select single option
		
		//driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();
		
		
		//count no of options
		List<WebElement> option=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println("Options in the dropdown is : " +option.size());
		
		//printing options
		
		for(WebElement op:option) {
			System.out.println(op.getText());
		}

	}

}
