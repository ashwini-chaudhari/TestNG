package intro;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeSuit_AfterSuit {
	@Test(priority=2)
	public void search() {
		System.out.println("This is search method");
	}
	@Test(priority=1)
	public void login() {
		System.out.println("This is login");
	}
	
	@BeforeSuite
	public void suite1() {
		System.out.println("This is suite1 method");
	}
	@AfterSuite
	public void suite2() {
		System.out.println("This is suite2 method \n");
	}

}
