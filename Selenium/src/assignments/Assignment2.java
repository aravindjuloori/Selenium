package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		WebElement adults=driver.findElement(By.cssSelector("#Adults"));
		Select ad=new Select(adults);
		ad.selectByIndex(3);
		WebElement child=driver.findElement(By.id("Childrens"));
		Select ch=new Select(child);
		ch.selectByValue("3");
		
		driver.findElement(By.cssSelector("#DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
		
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.name("airline")).sendKeys("indigo");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("#homeErrorMessage")).getText());	
		
		driver.close();
	}

}
