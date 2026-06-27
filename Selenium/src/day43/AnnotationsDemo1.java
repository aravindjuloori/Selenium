package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * 
 * @BeforeMethod
 * @After Method
 * 
 * Scenario 
 * 1.Login to application
 * 2.Perform search
 * 3.Logout from application
 * 
 * 4.Login to application
 * 5.Perform advanced search
 * 6.Logout from application
 * 
 * 
 */
public class AnnotationsDemo1 {
	
	
	@BeforeMethod
	public void Login() {
		System.out.println("This is login");
	}
	
	@Test(priority=1)
	public void search() {
		System.out.println("This is Search");
	}
	
	@Test(priority=2)
	public void advancedsearch() {
		System.out.println("This is advancedsearch");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("This is logout");
	}
	
}
