package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertions {
	
	
	
	/*
	 * @Test void test_hardAssertions() { 
	 * System.out.println("testing....");
	 * System.out.println("Testing...");
	 * 
	 * Assert.assertEquals(1, 2);
	 * 
	 * System.out.println("testing "); 
	 * System.out.println("Test");
	 * 
	 * }
	 */
	
	@Test
	void test_SoftAssertion() {
		System.out.println("testing....");
		System.out.println("Testing...");
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(1, 2);
		
		System.out.println("testing ");
		System.out.println("Test");	
		
		soft.assertAll();
	}

}
