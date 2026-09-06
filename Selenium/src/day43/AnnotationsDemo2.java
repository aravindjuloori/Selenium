package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 * @BeforeClass
 * @AfterClass
 * 
 * Scenario 
 * 1.Login to application
 * 2.Perform the search
 * 3.Perform the advanced search
 * 4.Logout from application
 * 
 * 
 */

public class AnnotationsDemo2 {
	
	@BeforeClass
	public void login() {
		System.out.println("This is login");
	}
	
	@Test(priority=1)
	public void search() {
		System.out.println("This is search operation");
	}
	
	@Test(priority=2)
	public void AdvancedSearch() {
		System.out.println("This is advanced Search operation");
	}
	
	@AfterClass
	public void Logout() {
		System.out.println("This is logout");
	}

}
