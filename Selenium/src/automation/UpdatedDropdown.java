package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\\\softwares\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.id("divpaxinfo")).click();
	/*	int i=1;
		while(i<5) {
			
			driver.findElement(By.id("divpaxinfo")).click();
			i++;
		}
		*/
		
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("divpaxinfo")).click();
		}
	}

}
