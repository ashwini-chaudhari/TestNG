package intro;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Invocation_Count {
	
	@Test(invocationCount=5)
	public void m1(ITestContext abc) {
		//System.out.println("This is m1 method");
		int CurrentInvocationCount=abc.getAllTestMethods()[0].getCurrentInvocationCount();
		System.out.println(CurrentInvocationCount);
		System.out.println("Test running");
	}

}
