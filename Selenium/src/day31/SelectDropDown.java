package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement drpcountryEle=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select drpcountry=new Select(drpcountryEle);

		//drpcountry.selectByVisibleText("Germany");
		//drpcountry.selectByValue("france");
		//drpcountry.selectByIndex(6);
		
		
		//Capture all the values from the dropdown
		List<WebElement> option=drpcountry.getOptions();
		System.out.println("No of options in a dropdown:" +option.size());
		
		//printing the options
		
		/*
		 * for(int i=0;i<option.size();i++) {
		 * 
		 * System.out.println(option.get(i).getText());
		 * 
		 * }
		 */
		
		for(WebElement op:option) {
			System.out.println(op.getText());
		}
	}

}
