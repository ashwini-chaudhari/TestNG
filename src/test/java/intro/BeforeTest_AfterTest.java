package intro;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTest_AfterTest {
	@Test(priority=2)
	public void search() {
		System.out.println("This is search method");
	}
	@Test(priority=1)
	public void login() {
		System.out.println("This is login");
	}
	
	@BeforeTest
	public void test1() {
		System.out.println("This is test1 method");
	}
	@AfterTest
	public void test2() {
		System.out.println("This is test2 method \n");
	}

}
