package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.spicejet.com/");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//dropdown with select tag in selenium we have a class called select
		
		WebElement currency=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s=new Select(currency);
		s.selectByIndex(3);
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByValue("AED");
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByVisibleText("USD");
		System.out.println(s.getFirstSelectedOption().getText());
		driver.close();
		
	}

}
