package day44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
	
	
	@Test(priority=1)
	public void openapp() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=2,dependsOnMethods= {"openapp"})  //This method will execute only when open app is passed.
	public void login() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=3,dependsOnMethods= {"login"}) //This method will execute only when login method is passed.
	public void search() {
		Assert.assertTrue(false);	
	}
	
	@Test(priority=4,dependsOnMethods= {"login","search"})//This method will execute only when login method  and search method is passed.
	public void advSearch() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=5,dependsOnMethods= {"login"})  //This method will execute only when login method is passed.
	public void logout() {
		Assert.assertTrue(true);
	}
	

}
