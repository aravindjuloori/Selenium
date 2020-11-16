package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement chkbox = driver.findElement(By.id("checkBoxOption1"));
			//System.out.println(chkbox.isSelected()); It will return false
		Assert.assertFalse(chkbox.isSelected());
		chkbox.click();
		// System.out.println(chkbox.isSelected()); It will return True as checkbox is
		// selected.
		Assert.assertTrue(chkbox.isSelected());

		chkbox.click();
		Assert.assertFalse(chkbox.isSelected());
		// System.out.println(chkbox.isSelected()); //It will return false

		// to find the no. of checkboxes
		System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());

	}

}
