package intro;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	//same method run multiple times so which method we have used in testNG
	//Invocationcount method
	@Test(dataProvider="data")
	public void login(String user, String password) {
		System.out.println("User name is "+user);
		System.out.println("Password is "+password+"\n");
		
		
	}
	
	@DataProvider
	public Object[][] data() {
		Object[][] data=new Object[4][2];     // starting from 1
		
		data[0][0]="shiv";    //we are defining array with 0 index
		data[0][1]="Pass123";
		
		data[1][0]="vashnav";
		data[1][1]="Pass456";
		
		data[2][0]="Ashwini";
		data[2][1]="Pass789";
		
		data[3][0]="Rahul"; 
		data[3][1]="Pass012";
		
		return data; //we are returning data and data is a object[[]	
		}
}
