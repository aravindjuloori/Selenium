package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions act=new Actions(driver);
		WebElement minSlider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		
		System.out.println("Default Location of the minSlider: "+minSlider.getLocation());
		/*
		 * System.out.println("Location of the minSlider: "+minSlider.getLocation().getX
		 * ());
		 * System.out.println("Location of the minSlider: "+minSlider.getLocation().getY
		 * ());
		 */
		
		act.dragAndDropBy(minSlider, 100, 246).perform();
		System.out.println("Location of the minSlider after changing: "+minSlider.getLocation());
		
		WebElement maxSlider=driver.findElement(By.xpath("//span[2]"));
		
		System.out.println("Default Location of the maxSlider: "+maxSlider.getLocation());
//		act.dragAndDropBy(maxSlider,-100, 246).perform();
//		System.out.println(" Location of the maxSlider after moving: "+maxSlider.getLocation());
	}

}
