package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\\\softwares\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com"); //It opens Google site in chrome browser
		driver.manage().window().maximize(); //It maximizes the browser
		System.out.println(driver.getTitle()); //It grabs the page title
		System.out.println(driver.getCurrentUrl()); //Validate if you are landed on correct URL
		//System.out.println(driver.getPageSource());
		
		driver.get("https://www.yahoo.com");
		System.out.println(driver.getCurrentUrl()); //Validate if you are landed on correct URL
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl()); //Validate if you are landed on correct URL
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl()); //Validate if you are landed on correct URL
		
		//driver.close();  //It closes the current browser
		
		driver.quit(); //It closes all the browsers opened by the selenium script
	}

}
