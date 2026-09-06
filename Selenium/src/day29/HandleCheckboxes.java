package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// 1.Select specific checkbox
//		driver.findElement(By.xpath("//input[@id='sunday']")).click();

		// 2.Select all the checkboxes

		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println(checkboxes.size());

		/*
		 * for(int i=0;i<checkboxes.size();i++) { checkboxes.get(i).click(); }
		 */
		// using for each

		/*
		 * for(WebElement checkbox:checkboxes) { checkbox.click(); }
		 */

		// 3.Select last 3 checkboxes

		/*
		 * for (int i=4; i<checkboxes.size();i++) { checkboxes.get(i).click(); }
		 */
		
		//4. Select first 3 checkboxes
		for(int i=0;i<3;i++) {
			checkboxes.get(i).click();
		}
		Thread.sleep(5000);
		
		for(int i=0;i<checkboxes.size();i++) {
			if(checkboxes.get(i).isSelected()) {
			checkboxes.get(i).click();
			}
		}
	}

}
