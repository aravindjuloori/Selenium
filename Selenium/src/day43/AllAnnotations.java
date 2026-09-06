package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {

	@BeforeSuite
	public void Bs() {
		System.out.println("This is BeforeSuite Annotation...");
	}

	@AfterSuite
	public void As() {
		System.out.println("This is AfterSuite Annotation...");
	}

	@BeforeTest
	public void bt() {
		System.out.println("This is BeforeTest Annotation...");
	}

	@AfterTest
	public void at() {
		System.out.println("This is AfterTest Annotation...");
	}

	@BeforeClass
	public void bc() {
		System.out.println("This is BeforeClass annotation...");
	}

	@AfterClass
	public void ac() {
		System.out.println("This is AfterClass Annotation...");
	}

	@BeforeMethod
	public void bm() {
		System.out.println("This BeforeMethod Annotation...");
	}

	@Test(priority = 1)
	public void search() {
		System.out.println("This is Search");
	}

	@Test(priority = 2)
	public void advancedsearch() {
		System.out.println("This is advancedsearch");
	}

	@AfterMethod
	public void am() {
		System.out.println("This is AfterMethod Annotation...");
	}
}
