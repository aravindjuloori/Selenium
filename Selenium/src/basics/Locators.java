package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {

	public static void main(String[] args) {
	
		
		//Invoking the browser
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("inputUsername")).sendKeys("Aravind");  //sending values to input box by using id locator
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");  //using Name locator
		
		//Locate the input field
        WebElement inputBox =driver.findElement(By.id("inputUsername"));      
		
     // Get default text using getAttribute("value")
        String defaultText = inputBox.getDomProperty("placeholder");
        System.out.println("Default username text is : " +defaultText);
		
        
      //Locate the input field
        WebElement inputBoxpasswprd =driver.findElement(By.name("inputPassword")); 
		
     // Get default text using getAttribute("value")
        String defaultText1= inputBoxpasswprd.getDomProperty("placeholder");
        System.out.println("Default password text is : " +defaultText1);
        
        driver.findElement(By.className("signInBtn")).click();    ///By Class Name locator
        
        
        
        //CSS syntax 1.tagname.classname 
        		//	2.tagName#id
        		//3.tagName[attribute='value']
        
       // String loginErrordetails=driver.findElement(By.cssSelector("p.error")).getText();   //By CSS selector
        
        String loginErrordetails=driver.findElement(By.cssSelector("p[class='error']")).getText();    //By CSS selector
        
        System.out.println("Login error details is displayed here: " +loginErrordetails);
        
		

	}

}
