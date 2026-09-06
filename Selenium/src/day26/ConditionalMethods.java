package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalMethods {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			
		//isDisplayed()-any webelement is displayed on the web page or not
		
		
		/*
		 * WebElement signinButton=driver.findElement(By.
		 * xpath("//button[@class='submit signInBtn']"));
		 * System.out.println(signinButton.isDisplayed());
		 */
		 
		 
		
	//	boolean signinbutton=driver.findElement(By.xpath("//button[@class='submit signInBtn']")).isDisplayed();
		//System.out.println(signinbutton);
		
		
	
	/*
	 * WebElement
	 * logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	 * System.out.println("Display status of logo : "+logo.isDisplayed());
	 */
	 
		 
			
	
	/*
	 * boolean
	 * status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).
	 * isDisplayed(); System.out.println("Display the status of logo: "+status);
	 */
	 
		
		
		
		//isenabled()  -- it is majorly used for inputboxes,dropdowns,radio buttons and checkboxes
		
		
		/*
		 * WebElement firstname=driver.findElement(By.id("inputUsername"));
		 * System.out.println(firstname.isEnabled());
		 * Assert.assertTrue(firstname.isEnabled());
		 */
		//boolean status=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		//System.out.println("Enabled status is :" +status);
		
		
		//isSelected()  -- this is used to check the element is selected or not (checkboxes and radio buttons)
		/*
		 * WebElement maleraido=driver.findElement(By.xpath("//input[@id='gender-male']"));
		 * WebElement femaleradio=driver.findElement(By.xpath("//input[@id='gender-female']"));
		 * 
		 * System.out.println("******Before Selection**********");
		 * System.out.println(maleraido.isSelected()); //false
		 * System.out.println(femaleradio.isSelected()); //false
		 * 
		 * 
		 * System.out.println("*****After selection male radio button************");
		 * 
		 * maleraido.click(); 
		 * System.out.println(maleraido.isSelected());//true
		 * System.out.println(femaleradio.isSelected());//false
		 * 
		 * 
		 * System.out.println("***After selecting female radio button*********");
		 * femaleradio.click();
		 * 
		 * System.out.println(maleraido.isSelected());//false
		 * System.out.println(femaleradio.isSelected());//true
		 */			
		
		
	}
	
	

}
