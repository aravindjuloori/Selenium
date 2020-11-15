package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//To check the no. of checkboxes in thepage.
		List<WebElement> boxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(boxes.size());
		System.out.println(driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]")).isSelected());
		driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]")).click();
		System.out.println(driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]")).isSelected());
	}

}
