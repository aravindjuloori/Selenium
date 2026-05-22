package day42;

import org.testng.annotations.Test;

public class FirstTestCase {
	
	@Test(priority=1)
	public void openapp() {
		
		System.out.println("Open the application");
	}

	@Test(priority=2)
	public void login() {
		System.out.println("Login to application");
	}
	
	@Test(priority=3)
	public void logout() {
		System.out.println("Logout from application");
	}
}
