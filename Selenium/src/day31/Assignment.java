package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement countryEle=driver.findElement(By.id("country-list"));
		
		Select sel=new Select(countryEle);
		List<WebElement> listopoptions=sel.getOptions();
		//List of options in the dropdown
		System.out.println(listopoptions.size());
		
		
		//printing all the options from the dropdown
		for(WebElement op:listopoptions) {
			System.out.println(op.getText());
		}
		
		//Selecting one option
		sel.selectByVisibleText("India");
		
		String firstoption=sel.getFirstSelectedOption().getText();
		Assert.assertEquals(firstoption, "India");
		

	}

}
