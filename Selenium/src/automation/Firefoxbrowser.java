package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Firefoxbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Firefox
		
		System.setProperty("webdriver.gecko.driver", "D:\\softwares\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//System.setProperty("webdriver.ie.driver", "D:\\softwares\\IEDriverServer\\IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.com"); //It opens browser in chrome browser
		driver.manage().window().maximize(); //It maximizes the browser
		System.out.println(driver.getTitle()); //It grabs the page title
		driver.quit(); //It closes the browser
	}

}
