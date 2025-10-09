package basics;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		
		//dropdown with select tag is static dropdown
		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown=new Select(staticdropdown);
		dropdown.selectByIndex(3);		//By index
		System.out.println(dropdown.getFirstSelectedOption().getText());		
		
		
		dropdown.selectByVisibleText("AED");  //By visibleText
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		dropdown.selectByValue("INR");  //By Value
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
			List<String> actualValues=new ArrayList<>();
		
		
			List<WebElement> options=dropdown.getOptions();
			
			for(WebElement option:options) {
				
				actualValues.add(option.getText().trim());
				
			}
			
			List<String> expectedValues = List.of("Select","INR", "AED", "USD");
	        
	        
	        if (actualValues.equals(expectedValues)) {
	            System.out.println("✅ Dropdown values match expected list!");
	        } else {
	            System.out.println("❌ Dropdown mismatch!");
	            System.out.println("Expected: " + expectedValues);
	            System.out.println("Actual:   " + actualValues);
	        }
	}

}
