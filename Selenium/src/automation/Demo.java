package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

		
		/*Step 1:Create Driver object . it is specific to each browser. It drivers all the automation. Below is the object created for
		chrome driver */
		
		//ChromeDriver driver=new ChromeDriver();
		
		//Step 2:
		/*But here we are actually executing and implementing methods present in webdriver interface. once Driver object We will strictly implement 
		the methods of web driver  */
		/*WebDriver is an interface which gives all methods for the automation.so you have to give the web driver knowledge to the driver object so that it will
		automate each and every ui in the browser to give that return type for that should be WebDriver */ 
		
		//WebDriver driver=new ChromeDriver();
		
		/*Step 3: This single step is not sufficient bcoz browsers are third party tools which are not related to selenium
		they will not allow to invoke the browser */
		
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}

}
