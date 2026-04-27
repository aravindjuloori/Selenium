package day44;

import org.testng.annotations.Test;

public class SignupTests {
	@Test(priority=1,groups= {"regression"})
	public void signupbyEmail() {
		System.out.println("This is signupbyEmail");
	}

	@Test(priority=2,groups= {"regression"})
	public void signupByFacebook() {
		System.out.println("This is signupByFacebook");
	}
	
	@Test(priority=3,groups= {"regression"})
	public void signupBytwitter() {
		System.out.println("This issignupBytwitter");
	}
}
