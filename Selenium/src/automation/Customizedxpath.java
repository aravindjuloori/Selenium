package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customizedxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\\\softwares\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		
		//Xpath's syntax //tagname[@attribute='value']
		/*driver.findElement(By.xpath("//*[@id='username']")).sendKeys("salesforce");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		*/
		
		//CSS syntax tagname[attribute='value']
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("salesforce");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("password");
		//driver.findElement(By.cssSelector("input[value='Log In']")).click();
		//driver.findElement(By.cssSelector("input#Login")).click();
		driver.findElement(By.cssSelector("#Login")).click();
		//driver.close();
		
		
	}

}
