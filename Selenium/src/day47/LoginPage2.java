package day47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	WebDriver driver;
	
	//constructor
	
	LoginPage2(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locators
	
	/*
	 * By txt_Username_loc=By.xpath("//input[@placeholder='Username']"); By
	 * txt_password_loc=By.xpath("//input[@placeholder='Password']"); By
	 * login_button_loc=By.xpath("//button[normalize-space()='Login']");
	 */
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_UserName;
	
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement login_btn;
	
	
	//Action methods
	public void setUserName(String user) {
		
		txt_UserName.sendKeys(user); 
	}
	public void setPassword(String pwd) {
		txt_password.sendKeys(pwd);
		
	}
	public void clickLogin() { 
		login_btn.click(); 
		}
	
	
	/*
	 * public void setUserName(String user) {
	 * 
	 * driver.findElement(txt_Username_loc).sendKeys(user); }
	 * 
	 * public void setPassword(String pwd) {
	 * driver.findElement(txt_password_loc).sendKeys(pwd); }
	 * 
	 * public void clickLogin() { driver.findElement(login_button_loc).click(); }
	 */
}
