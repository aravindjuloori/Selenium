package rahul;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommerceflow {

	public static void main(String[] args) throws InterruptedException {
		// Expected list of vegetables to be added to cart
		String[] itemsNeeded = {"Brocolli","Cucumber","Carrot","Beans"};
		WebDriverManager.chromedriver().setup();
		
		// Initialize ChromeOptions to configure browser settings
        ChromeOptions options = new ChromeOptions();

        // Add the argument for incognito mode
        options.addArguments("--incognito");
        
		WebDriver driver = new ChromeDriver(options);

		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(5));
		

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		addItems(driver,itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();

		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

		driver.findElement(By.cssSelector("button.promoBtn")).click();

		//explicit wait

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	
	public static void addItems(WebDriver driver,String itemsNeeded[]) {
		int j = 0;
		List<WebElement> productnames = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < productnames.size(); i++) {

			// format it to get actual vegetable name
			String[] name = productnames.get(i).getText().split("-");
			String formattedName = name[0].trim();

			// Check whether name extracted is present in array or not
			// Convert array to arraylist for easy search with contains
			// Arrays takes less memory so we declare array and during runtime we are
			// converting to arraylist

			List<String> itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) {

				j++;
				// Click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				// break; // we cannot use break statement when we are using the array of list

				// 3 times
				if (j == itemsNeeded.length) {
					break;
				}

			}

		}
	}
}
