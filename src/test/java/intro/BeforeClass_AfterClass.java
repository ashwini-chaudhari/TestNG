package intro;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClass_AfterClass {
	
	@Test(priority=2)
	public void search() {
		System.out.println("This is search method");
	}
	@Test(priority=1)
	public void login() {
		System.out.println("This is login");
	}
	
	@BeforeClass
	public void m1() {
		System.out.println("This is m1 method");
	}
	@AfterClass
	public void m2() {
		System.out.println("This is m2 method \n");
	}

}
