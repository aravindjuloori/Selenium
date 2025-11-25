package rahul;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_txt_Todate")).isEnabled());
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
				
		  if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1")){
		  
		  System.out.println("Its enabled");
		  Assert.assertTrue(true);
		  
		  }
		  else
		  {
			  Assert.assertTrue(false);
		  }
		 
		
		
		//find no. of checkboxes in the page
			List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
			System.out.println(checkboxes.size());
			Assert.assertEquals(checkboxes.size(), 6);
			
			
	}

}
