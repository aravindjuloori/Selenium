package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	//constructor
	
	LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	//Locators
	
	By txt_Username_loc=By.xpath("//input[@placeholder='Username']");
	By txt_password_loc=By.xpath("//input[@placeholder='Password']");
	By login_button_loc=By.xpath("//button[normalize-space()='Login']");
	
	
	//Action methods
	public void setUserName(String user) {
		
		driver.findElement(txt_Username_loc).sendKeys(user);
	}
	
	public void setPassword(String pwd) {
		driver.findElement(txt_password_loc).sendKeys(pwd);
	}
	
	public void clickLogin() {
		driver.findElement(login_button_loc).click();
	}
}
