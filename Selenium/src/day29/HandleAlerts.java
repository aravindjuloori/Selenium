package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//1.simple alert with OK button
		/*driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		Thread.sleep(1000);
		
		Alert myAlert=driver.switchTo().alert();
		System.out.println(myAlert.getText());
		myAlert.accept();
		*/
		
		//2.Confirmation alert with OK and Cancle button
		/*driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Thread.sleep(2000);
		
		//driver.switchTo().alert().accept();   //It will close the alert window using OK button
		driver.switchTo().alert().dismiss();  //It will close the alert window using cancel button
		*/
		
		//3.Prompt alert 
		
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		
		Alert myalert=driver.switchTo().alert();
		
		Thread.sleep(2000);
		myalert.sendKeys("Aravind");
		Thread.sleep(2000);
				myalert.accept();
		
		
	}

}
