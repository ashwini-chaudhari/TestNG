package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	@Test(priority=2)
	public void search() {
		System.out.println("Its search function demo");
	}
	
	@Test(priority=1)
	public void login() 
	{
 		
		System.out.println("This is login funtion");
		
	}
	
	@Test(dependsOnMethods="search")
	public void logout() {
		System.out.println("This is log out function");
		String a="Ashwini";
		//Assert.assertEquals(a.equals("Ashwini"), true);   //assertEquals main both condition to be compare
		//Assert.assertFalse(true,"Conditon is failed");  //java.lang.AssertionError: Conditon is failed expected [false] but found [true]
		//Assert.assertTrue(false, "Cond is fail"); //java.lang.AssertionError: Cond is fail expected [true] but found [false]
		//Assert.assertNull(null);  //it varify null 
		Assert.assertNotNull("Ashwini");
	}
	
	@Test(priority=-1)
	public void goToTheLink() {
		System.out.println("We will reach the link");
	}
	
	

}
