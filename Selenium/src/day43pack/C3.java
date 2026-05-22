package day43pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {

	
	
	@Test
	public void pqr() {
		
		System.out.println("This is pqr from C3");
	}
	
	@BeforeSuite
	public void Bs() {
		System.out.println("This is BeforeSuite method");
	}
	
	@AfterSuite
	public void As() {
		System.out.println("This is AfterSuite method");
	}
}
