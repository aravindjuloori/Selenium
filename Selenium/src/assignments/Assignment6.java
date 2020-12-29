package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		
		String option=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		
		
		WebElement dropdown=driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
		Select s=new Select(dropdown);
		s.selectByVisibleText(option);
		
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys(option);
		
		driver.findElement(By.id("alertbtn")).click();
		
		driver.switchTo().alert();
		
		String alertText=driver.switchTo().alert().getText();
		
		if(alertText.contains(option)) {
			
			System.out.println("Success");
		}
		
		else
		{
			System.out.println("failure");
		}
		
		
	}

}