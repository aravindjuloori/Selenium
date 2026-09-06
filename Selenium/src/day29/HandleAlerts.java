package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// 1.simple alert with OK button  normal Alert

		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		Thread.sleep(1000);

		Alert myAlert = driver.switchTo().alert();
		System.out.println(myAlert.getText());
		myAlert.accept();

		// 2.Confirmation alert with OK and Cancelbutton
		/*
		 * driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		 * Thread.sleep(2000);
		 * 
		 * //driver.switchTo().alert().accept(); //It will close the alert window using
		 * OK button driver.switchTo().alert().dismiss(); //It will close the alert
		 * window using cancel button String
		 * cancelmessage=driver.findElement(By.xpath("//*[@id='demo']")).getText();
		 * Assert.assertEquals(cancelmessage, "You pressed Cancel!");
		 */

		// 3.Prompt alert with name ,yes and no option

		/*
		 * driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		 * Thread.sleep(5000); Alert myalert=driver.switchTo().alert(); String
		 * name="Aravind"; myalert.sendKeys(name); Thread.sleep(5000); myalert.accept();
		 * String
		 * successmessage=driver.findElement(By.xpath("//*[@id='demo']")).getText();
		 * Assert.assertEquals(successmessage, "Hello " +name+ "! How are you today?");
		 */
	}

}
