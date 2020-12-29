package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Endtoend {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	//	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
			
			System.out.println("Its disabled");
			Assert.assertTrue(true);
			
		}
		else {
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
				
				driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]")).click();
				Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]")).isSelected());
				
				Select 	curr=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
				curr.selectByVisibleText("USD");
				//driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
				//driver.findElement(By.cssSelector("input[Value='Search']")).click();
				//driver.findElement(By.xpath("//input[@Value='Search']")).click();
				//driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
				driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
				
//				driver.switchTo().alert().accept();
	}			

}
