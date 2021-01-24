package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		WebElement table=driver.findElement(By.xpath("//table[@id='product']/tbody"));
		
		int rowCount=table.findElements(By.tagName("tr")).size();
		int colCount=table.findElements(By.tagName("th")).size();
		
		
		System.out.println(rowCount);
		System.out.println(colCount);
		
		WebElement secondRow=driver.findElement(By.xpath("//*[@id='product']/tbody/tr[3]"));
		
		int count=secondRow.findElements(By.tagName("td")).size();
		
		for(int i=0;i<count;i++) {
			System.out.println(secondRow.findElements(By.tagName("td")).get(i).getText());
		}
	}

}
