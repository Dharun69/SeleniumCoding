package seleniumInterviews;

import org.testng.annotations.Test;

public class TestMultipleTimes {
	
	@Test(invocationCount = 3)
	public void test() {
		System.out.println("dhar");
	}
	
}
