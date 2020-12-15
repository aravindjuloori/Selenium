package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// 
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//To check the no. of checkboxes in the page.
		List<WebElement> boxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(boxes.size());
		
		//System.out.println(driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]")).isSelected());
		
		driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]")).isSelected());
		//System.out.println(driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]")).isSelected());
		Thread.sleep(5000);
		
		String actualText=driver.findElement(By.id("divpaxinfo")).getText();
		
		Assert.assertEquals(actualText, "1 Adult");
	
	}

}
