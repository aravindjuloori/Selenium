package day43pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {

	@Test
	public void xyz() {
		System.out.println("This is xyz from C2 ");
	}

	@AfterTest
	public void at() {
		System.out.println("This is AfterTest method");
	}

}
