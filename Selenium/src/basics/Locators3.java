package basics;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//siblings to siblings and child to parent traverse
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String LoginText=driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		System.out.println(LoginText);
		
		
		String LoginText1=driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a[2]")).getText();
		System.out.println(LoginText1);
		
		
		
	}

}
