package intro;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test2 {
	
	@Test
	public void login() {
		String a="ashwini";
		//Assert.assertEquals(a.equals("Ashwini"), true);
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(a.equals("ashwini"), false);
		System.out.println("This is login function");
		soft.assertAll();
	}
	@Parameters({"url"})     //calling the parameters from testng.xml by using name
	@Test(priority=-1)
	public void goToTheLink(String xyz)   //normal class madhe paramaeter pull karat aahe
	{
		System.out.println(xyz);   //we are printing that
		System.out.println("We will reach the link");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This will exicute before every method \n");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This will exicute after every method \n");
		
	}

}
