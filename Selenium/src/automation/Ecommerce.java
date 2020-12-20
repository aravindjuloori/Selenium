package automation;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int j=0;
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Expected list of items to be added to the cart
		
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot","Carrot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++) {
			
			String[] name=products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			List<String> itemsNeededList=Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
				if(j==itemsNeeded.length) {
					break;
				}
			}
			
		}
		
	}

}
