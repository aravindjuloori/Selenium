package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {

	public static void main(String[] args) {
		
		//Static dropdown
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		// Select dropdown with select tag is static dropdown
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(3); // by index
		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());

	}

}
